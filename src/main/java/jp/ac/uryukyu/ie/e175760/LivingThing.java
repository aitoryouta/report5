package jp.ac.uryukyu.ie.e175760;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing(String name, int maximumHP, int attack) {
        this.name  = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead() { return dead; }

    public String getName(){
        return name;
    }

    public void setDead(boolean dead){ this.dead = dead;}

    public int getAttack(){return attack;}

    public void setAttack(int attack){this.attack=attack;}

    public void setName(String name){this.name=name;}

    public int getHitPoint(){ return hitPoint; }

    public void setHitPoint(int hitPoint){this.hitPoint=hitPoint;}


    public void attack(LivingThing naltoma) {
        if(hitPoint >= 0) {
            int damage = (int) (Math.random() * attack);
            int Critical= (int) (Math.random() * 10);

            if (isDead()) {
                damage = 0;
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), naltoma.getName());
            }else if(damage==0){
                System.out.printf("%sの攻撃！,,,だが、%sは攻撃を回避した！\n", getName(), naltoma.getName());
            }else if(Critical <= 3){
                damage = damage*2;
                System.out.printf("%sの攻撃！痛恨の一撃！！%sに%dのダメージを与えた！！\n", getName(), naltoma.getName(), damage);
            }else{
                System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), naltoma.getName(), damage);
            }
            naltoma.wounded(damage);
        }
    }


    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}