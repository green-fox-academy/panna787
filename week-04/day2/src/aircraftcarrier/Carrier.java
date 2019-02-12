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

    public void fill(){
        int totalAmmoNeeded = 0;
        for (Aircraft aircraft: aircrafts
             ) {
            totalAmmoNeeded += aircraft.maxAmmo - aircraft.currentAmmo;
        }

        if (totalAmmoNeeded > ammo){

        }
    }
}
