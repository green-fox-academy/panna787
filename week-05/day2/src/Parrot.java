public class Parrot extends Animal{

    String name = "Parrot";

    public Parrot(String name, boolean isHealthy, int healCost){
        super(name, isHealthy, (int)(Math.random()) * 6 + 4);
    }

}
