package gardenapplication;

public class Main {
    public static void main(String[] args) {

        Flower yellowFlower = new Flower("yellow");
        Flower blueFlower = new Flower("blue");

        Tree orangeTree = new Tree("orange");
        Tree purpleTree = new Tree("purple");

        Garden myGarden = new Garden();

        myGarden.addPlant(yellowFlower);
        myGarden.addPlant(blueFlower);
        myGarden.addPlant(orangeTree);
        myGarden.addPlant(purpleTree);

        myGarden.info();

        myGarden.wateringPlants(40);

        myGarden.wateringPlants(70);


    }
}
