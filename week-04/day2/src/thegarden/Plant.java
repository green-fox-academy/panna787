package thegarden;

public class Plant {

    String color;
    double currentWaterAmount;
    boolean needsWater = true;

    public void getWater(double water){
        currentWaterAmount += water;

    }

    public void info(){

    }

}
