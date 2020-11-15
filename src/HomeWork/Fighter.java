package HomeWork;

public class Fighter {

    public String name;
    public int health, damagePerAttack;


    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {


        while (fighter1.health > 0 && fighter2.health >0){
            fighter2.health -= fighter1.damagePerAttack;
            fighter1.health -= fighter2.damagePerAttack;
        }
        if (fighter1.health <= 0 && fighter2.health >= 0){
            return firstAttacker;
        } else {
            if(fighter1.health <= 0) {
                return fighter1.name;
            } else {
                return fighter2.name;
            }
        }
    }
}
