package jp.ac.uryukyu.ie.e205736;

public class LivingThing {
    /**
     * 生き物のクラス。 String name; 
     * 名前 int hitPoint; 
     * HP int attack; 
     * 攻撃力 boolean dead;
     * 生死状態。true=死亡。
     */
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name     名
     * @param hitpoint HP
     * @param attack   攻撃力
     */

    public LivingThing(String name, int hitpoint, int attack) {
        this.name = name;
        this.hitPoint = hitpoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitpoint, attack);
    }

    /**
     * 死亡状況値を取得するためのメソッド
     * 
     * @return LivingThingクラスのdeadに保存されている値
     */
    public boolean isDead() {
        return this.dead;
    }

    /**
     * LivingThingクラスの名前を取得するためのメソッド
     * 
     * @return LivingThingクラスのnameに保存されている値
     */
    public String getName() {
        return this.name;
    }

    /**
     * 対象へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
