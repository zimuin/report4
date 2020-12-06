package jp.ac.uryukyu.ie.e205736;

/**
 * 敵クラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      モンスター名
     * @param maximumHP モンスターのHP
     * @param attack    モンスターの攻撃力
     */
    public Enemy(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。 attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * 
     * @param hero 攻撃対象
     */
    public void attack(Hero hero) {
        if (this.dead == false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
    
    /**
     * クラス外からEnemyの名前を取得するためのメソッド
     * @return Enemyクラスのnameに保存されている値
     */
    public String getName() {
        return this.name;
    } 
    
    /**
     * クラス外からEnemyの体力値を取得するためのメソッド
     * @return　Enemyクラスのhitpointに保存されている値
     */
    public int getHitpoint() {
        return this.hitPoint;
    }

    /**
     * クラス外からEnemyの攻撃力値を取得するためのメソッド
     * @return　Enemyクラスのattackに保存されている値
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * クラス外からEnemyの死亡状況値を取得するためのメソッド
     * @return　Enemyクラスのdeadに保存されている値
     */
    public boolean getDead() {
        return this.dead;
    }

    /**
     * クラス外からEnemyの名前を設定するためのメソッド
     * @param name　設定したEnemyの名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * クラス外からEnemyの体力値を設定するためのメソッド
     * @param hitPoint　設定したEnemyの体力値
     */
    public void setHitpoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * クラス外からEnemyの攻撃力値を設定するためのメソッド
     * @param attack　設定したEnemyの攻撃力値
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * クラス外からEnemyの死亡状況値を設定するためのメソッド
     * @param dead　設定したEnemyの死亡状況値
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }

}
