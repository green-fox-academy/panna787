public class Cat extends Animal{

    String name = "Cat";

    public Cat(String name, boolean isHealthy, int healCost){
        super(name, isHealthy, (int)(Math.random()) * 6);
    }
}
