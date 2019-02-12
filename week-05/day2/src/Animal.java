public class Animal {

    String name;
    boolean isHealthy;
    int healCost;

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
}
