package gardenapplication;

public class Tree extends Plant{

    public Tree(String color){

        this.type = "Tree";
        this.color = color;
    }

    public void getWater(double water){
        currentWaterAmount += water * 0.4;
        if(currentWaterAmount >= 10){
            needsWater = false;
        }
    }


}
