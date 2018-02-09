package jp.ac.uryukyu.ie.e175760;

import org.junit.jupiter.api.Test;
/*import sun.font.TrueTypeFont;*/

import static org.junit.jupiter.api.Assertions.*;

 class EnemyTest {
    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("demo勇者", heroHP, 5);
        Enemy enemy = new Enemy("demoスライム", 6, 3);
        enemy.setDead(true);

        for (int i = 0; i < 10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.getHitPoint());
    }
}
