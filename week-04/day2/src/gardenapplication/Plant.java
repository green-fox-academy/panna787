package gardenapplication;

public class Plant {

    String type;
    String color;
    double currentWaterAmount;
    boolean needsWater = true;

    public void getWater(double water){
        currentWaterAmount += water;

    }

    public void info(){
        if (needsWater) {
            System.out.println("The " + color + " " + type + " needs water");
        } else {
            System.out.println("The " + color + " " + type + " doesnt need water");
        }



    }

}
