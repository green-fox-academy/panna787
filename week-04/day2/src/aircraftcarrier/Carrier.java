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
            if (aircraft.isPriority()){
                priorityAircrafts.add(aircraft);
            }
        }
        return priorityAircrafts;
    }

    public ArrayList<Aircraft> getNonPriorityAircrafts(){
        ArrayList<Aircraft> nonPriorityAircrafts = new ArrayList<>();

        for (Aircraft aircraft: aircrafts
        ) {
            if (!aircraft.isPriority()){
                nonPriorityAircrafts.add(aircraft);
            }
        }
        return nonPriorityAircrafts;
    }

    public int calculateAmmoNeeded(){
        int totalAmmoNeeded = 0;
        int ammoToFill = 0;
        for (Aircraft aircraft: aircrafts
        ) {
            ammoToFill = aircraft.maxAmmo - aircraft.currentAmmo;
            totalAmmoNeeded += ammoToFill;
        }

        return totalAmmoNeeded;
    }

    public void fill(){
        for (Aircraft aircraft: getPriorityAircrafts()
             ) {
            if(ammo == 0){
                throw new ArithmeticException();
            }
            aircraft.refill(ammo);
        }

        for (Aircraft aircraft: getNonPriorityAircrafts()
        ) {
            if(ammo == 0){
                throw new ArithmeticException();
            }
            aircraft.refill(ammo);
        }

    }
}
