public class Dog extends Animal {

    String name = "Dog";

    public Dog(String name, boolean isHealthy, int healCost){
        super(name, isHealthy, (int)(Math.random()) * 7 + 1);
    }
}
