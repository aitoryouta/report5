package jp.ac.uryukyu.ie.e175760;


public class Hero extends LivingThing{
    public Hero(String name, int maximumHP, int attack){
        super(name,maximumHP,attack);
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
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}

