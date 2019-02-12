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

    public ArrayList<Aircraft> getPriorityAircrafts(){
        ArrayList<Aircraft> priorityAircrafts = new ArrayList<>();

        for (Aircraft aircraft: aircrafts
             ) {
            if ((aircraft.isPriority())){
                aircrafts.add(aircraft);
            }
        }
        return priorityAircrafts;
    }

    public void fill(){
        int totalAmmoNeeded = 0;
        int ammoToFill = 0;
        for (Aircraft aircraft: aircrafts
             ) {
            ammoToFill = aircraft.maxAmmo - aircraft.currentAmmo;
            totalAmmoNeeded += ammoToFill;
        }
        
    }
}
