package gardenapplication;

public class Tree extends Plant{

    public Tree(String color){
        this.color = color;
    }

    public void getWater(double water){
        currentWaterAmount += water * 0.4;
        if(currentWaterAmount >= 10){
            needsWater = false;
        }
    }

    public void info() {
        if (needsWater) {
            System.out.println("The " + color + " Tree needs water");
        } else {
            System.out.println("The " + color + " Tree doesnt need water");
        }
    }

}
