package jp.ac.uryukyu.ie.e175760;

public class Enemy extends LivingThing {
    public Enemy(String name, int maximumHP, int attack) {

        super(name, maximumHP, attack);
        this.setName(name);
        setHitPoint(maximumHP);
        this.setAttack(attack);
        setDead(false);

    }


    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}
