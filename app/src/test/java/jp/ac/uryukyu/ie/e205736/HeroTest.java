package jp.ac.uryukyu.ie.e205736;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    /**
     * Warriorクラスからオブジェクトを生成し、 attackWithWeponSkillを3回実行し、
     * 3回ともattackの150%ダメージになっていることを確認する
     */
    @Test
    void skillTest() {
        int testSlimeHp = 1000;
        int testWarriorAttack = 1;
        Warrior demoWarrior = new Warrior("デモ勇者", 100, testWarriorAttack);
        Enemy slime = new Enemy("スライムもどき", testSlimeHp, 100);
        for (int i = 0; i < 3; i++) {
            demoWarrior.attackWithWeponSkill(slime);
            testSlimeHp -= testWarriorAttack * 1.5;
            assertEquals(slime.hitPoint, testSlimeHp);
            /**
             * ウォリアークラスの武器スキルメソッドの中と外で同じ計算をして、等しいか調べる。
             */
        }

    }
}