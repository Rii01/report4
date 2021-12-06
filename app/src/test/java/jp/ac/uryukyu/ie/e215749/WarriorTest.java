package jp.ac.uryukyu.ie.e215749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
    
class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        Warrior demoHero = new Warrior("デモ勇者", 10, 5);
        Enemy slime = new Enemy("スライムもどき", 100, 0);
        int nowEnemyHP;
        int WeponSkillAttack = (int)(demoHero.getAttack()*1.5);
        for (int i = 0;i<3;i++){
            nowEnemyHP = slime.getHitPoint();
            demoHero.attackWithWeponSkill(slime);
            assertEquals(nowEnemyHP-WeponSkillAttack, slime.getHitPoint());
            System.out.printf("%sの残りHP: %d\n",slime.getName(),slime.getHitPoint());
        }


    }

}

