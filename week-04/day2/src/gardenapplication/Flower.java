package gardenapplication;

public class Flower extends Plant{

    public Flower(String color){

        this.type = "Flower";
        this.color = color;
    }

    public void getWater(double water){
        currentWaterAmount += water * 0.75;
        if(currentWaterAmount >= 5){
            needsWater = false;
        }
    }


}
