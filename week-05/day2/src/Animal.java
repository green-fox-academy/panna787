public class Animal {

    String name;
    boolean isHealthy;
    int healCost;



    public Animal(String name, boolean isHealthy, int healCost){
        this.name = name;
        this.isHealthy = isHealthy;
        this.healCost = healCost;
    }

    public void heal(){
        this.isHealthy = true;

    }

    public boolean isAdoptable(){
        if(this.isHealthy){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String status = "";

        if(this.isHealthy){
            status = this.name + "is healthy, and adoptable.";
        } else {
            status = this.name + "is not healthy (" + this.healCost + "€), and not adoptable.";
        }

        return status;
    }
}
