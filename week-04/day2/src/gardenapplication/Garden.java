package gardenapplication;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> plants;

    public Garden(){
        this.plants = new ArrayList<>();
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    public void wateringPlants(double water){
        int plantsToWater = 0;
        for (Plant plant: plants
             ) { if(plant.needsWater){
                 plantsToWater += 1;
            }
        }
        double waterForOnePlant = water / plantsToWater;

        for (Plant plant: plants
             ) {
            plant.getWater(waterForOnePlant);
            plant.info();
        }

    }

    public void info(){
        for (Plant plant: plants
        ) {
            plant.info();
        }
    }
}
