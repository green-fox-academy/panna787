public class Animal {

    String name;
    boolean isHealthy;
    int healCost;

    public Animal(){

    }

    public Animal(String name){
        this.name = name;
    }

    public void heal(){
        isHealthy = true;
    }

    public boolean isAdoptable(){
        if(isHealthy){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String status = "";

        if(this.isHealthy){
            status = this.name + "is healthy, and adoptable";
        } else {
            status = this.name + "is not healthy (" + healCost + "€), and not adoptable";
        }

        return status;
    }
}
