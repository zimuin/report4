package jp.ac.uryukyu.ie.e205736;

/**
 * ヒーロークラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing {

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      ヒーロー名
     * @param hitPoint ヒーローのHP
     * @param attack    ヒーローの攻撃力
     */
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    /**
     * クラス外からHeroの体力値を取得するためのメソッド
     * 
     * @return Heroクラスのhitpointに保存されている値
     */
    public int getHitpoint() {
        return this.hitPoint;
    }

    /**
     * クラス外からHeroの攻撃力値を取得するためのメソッド
     * 
     * @return Heroクラスのattackに保存されている値
     */
    public int getAttack() {
        return this.attack;
    }

    /**
     * クラス外からHeroの名前を設定するためのメソッド
     * 
     * @param name 設定したHeroの名前
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * クラス外からHeroの体力値を設定するためのメソッド
     * 
     * @param hitPoint 設定したHeroの体力値
     */
    public void setHitpoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    /**
     * クラス外からHeroの攻撃力値を設定するためのメソッド
     * 
     * @param attack 設定したHeroの攻撃力値
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * クラス外からHeroの死亡状況値を設定するためのメソッド
     * 
     * @param dead 設定したHeroの死亡状況値
     */
    public void setDead(boolean dead) {
        this.dead = dead;
    }
    
}