package jp.ac.uryukyu.ie.e225733;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class WarriorTest {
    @Test void attackTest() {
        int defaultWarriorAttack = 100;
        int defaultEnemyHitpoint = 1000;
        for (int i=0; i<3; i++) {
            Warrior demoWarrior = new Warrior("デモウォーリアー", 100, defaultWarriorAttack);
            Enemy demoEnemy = new Enemy("デモスライム",defaultEnemyHitpoint, 10);
            demoWarrior.attackWithWeponSkill(demoEnemy);
            assertEquals(defaultWarriorAttack * 1.5, defaultEnemyHitpoint - demoEnemy.getHitpoint());
        }
    }
}
    
