package jp.ac.uryukyu.ie.e205736;

/**
 * ウォリアークラス(ヒーロークラスの上位職)
 */
public class Warrior extends Hero{
    public Warrior(String name,int hitPoint,int attack){
        super(name, hitPoint, attack);
    }

    /**
     * 武器スキル。攻撃力の150%のダメージが与えられる。
     * @param opponent
     */
    public void  attackWithWeponSkill(LivingThing opponent){
        int damage = (int) (1.5 * attack);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }
}