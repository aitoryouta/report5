package jp.ac.uryukyu.ie.e175760;

public class Enemy extends LivingThing {
    public Enemy(String name, int maximumHP, int attack) {

        super(name, maximumHP, attack);
        this.setName(name);
        setHitPoint(maximumHP);
        this.setAttack(attack);
        setDead(false);

    }

    public void attack(LivingThing naltoma) {
        int damage = (int) (Math.random() * getAttack());
        int Critical = (int) (Math.random() * 10);

        if (isDead()) {
            damage = 0;
            System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), naltoma.getName());
        }else if(damage==0){
            System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), naltoma.getName());
        }else if(Critical <= 3){
            damage = damage*2;
            System.out.printf("%sの攻撃！会心の一撃！！%sに%dのダメージを与えた！！\n", getName(), naltoma.getName(), damage);
        }else{
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), naltoma.getName(), damage);
        }
        naltoma.wounded(damage);
    }

    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if( getHitPoint() <= 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }}
