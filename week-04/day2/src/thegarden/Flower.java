package thegarden;

public class Flower extends Plant{

    public Flower(String color){
        this.color = color;
    }

    public void getWater(double water){
        currentWaterAmount += water * 0.75;
        if(currentWaterAmount >= 5){
            needsWater = false;
        }
    }

    public void info(){
        if(needsWater){
            System.out.println("The " + color + " Flower needs water");
        } else {
            System.out.println("The " + color + " Flower doesnt need water");
        }
    }

}
