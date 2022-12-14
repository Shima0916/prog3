package jp.ac.uryukyu.ie.e225733;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    
    /**
     * nameのゲッター
     * @return str型のnameを返す
     */
    public String getName(){
        return this.name;
    }
    /**
     * attckのゲッター
     * @return int型のattackを返す
     */
    public int getAttack(){
        return this.attack;
    }
    /**
     * hitpointのゲッター
     * @return int型のhitPointを返す
     */
    public int getHitpoint(){
        return this.hitPoint;
    }
    /**
     * deadのゲッター
     * @return boolean型のdeadを返す
     */
    public boolean getDead(){
        return this.dead;
    }
    

    
    /**
     * attackのセッター
     */
    public void setAttck(){
        this.attack = attack;
    }
    /**
     * nameのセッター
     */
    public void setName(){
        this.name = name;
    }
    /**
     * hitpointのセッター
     */
    public void setHitpoint(){
        this.hitPoint = hitPoint;
    }
    /**
     * deadのセッター
     */
    public void setDead(){
        this.dead = dead;
    }
    


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}