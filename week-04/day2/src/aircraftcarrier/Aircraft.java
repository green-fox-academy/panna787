package aircraftcarrier;

public class Aircraft {

    String type;
    int maxAmmo;
    int baseDamage;
    int currentAmmo;
    int allDamage;

    public Aircraft(String type){
        this.type = type;
        this.maxAmmo = type.equals("F16") ? 8 : 12;
        this.baseDamage = type.equals("F16") ? 30 : 50;
        this.currentAmmo = 0;
        this.allDamage = baseDamage * currentAmmo;
    }

    public int fight(){
        allDamage = baseDamage * currentAmmo;
        currentAmmo = 0;

        return allDamage;
    }

    public int refill(int ammoToFill){
        int remainingAmmo = ammoToFill;
        if(ammoToFill + currentAmmo > maxAmmo){
            currentAmmo = maxAmmo;
            remainingAmmo = ammoToFill - maxAmmo;
        } else {
            currentAmmo += ammoToFill;
            remainingAmmo = 0;
        }
        return remainingAmmo;
    }

    public String getType(){
        return type;
    }

    public String getStatus(){
        String status = "Type: " + type + ", Ammo: " + currentAmmo + ", Base Damage: " + baseDamage + ", All Damage: " + allDamage;

        return status;
    }

    public boolean isPriority(){
        if (type.equals("F35")){
            return true;
        } else {
            return false;
        }
    }
}
