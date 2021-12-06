package jp.ac.uryukyu.ie.e215749;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if( !dead ){
            int damage = (int)(attack*1.5);
            System.out.printf("%sの攻撃！ウェポンスキル発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    } 
}
