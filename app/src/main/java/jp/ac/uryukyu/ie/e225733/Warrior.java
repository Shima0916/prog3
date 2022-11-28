package jp.ac.uryukyu.ie.e225733;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP,int attack){
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
    


    public void attackWithWeponSkill(LivingThing l){
        if ( this.dead == false ) {
            int damage = (int)(this.attack * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, l.getName(), damage);
            l.wounded(damage);
        }
    }
}
