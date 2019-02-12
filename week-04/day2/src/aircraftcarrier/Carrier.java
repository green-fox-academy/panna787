package aircraftcarrier;

import java.util.ArrayList;

public class Carrier {

    ArrayList<Aircraft> aircrafts;
    int ammo;
    int hp;

    public Carrier(int ammo, int hp){
        this.aircrafts = new ArrayList<>();
        this.ammo = ammo;
        this.hp = hp;
    }

    public void add(Aircraft aircraft){
        aircrafts.add(aircraft);
    }
}
