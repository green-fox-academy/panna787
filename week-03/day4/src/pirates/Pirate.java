package pirates;

public class Pirate {
    String name;
    boolean hasParrot;
    int drunkenness;
    boolean isDead;

    public Pirate(String name) {
        this.name = name;
        this.hasParrot = false;
        this.drunkenness = 0;
        this.isDead = false;
    }

    public void drinkSomeRum() {
        if(isDead) {
            System.out.println("He's dead");
        } else {
            drunkenness += 5;
        }
    }

    public void howsItGoingMate() {
        if(isDead) {
            System.out.println("He's dead");
        } else if(drunkenness <= 20){
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            drunkenness = 0;
        }
    }

    public void die(){
        isDead = true;
    }
}
