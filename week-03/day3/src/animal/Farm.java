package animal;

import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> animals;
    int freePlacesForNewAnimals;

    public void breed(Animal newAnimal){
        if (freePlacesForNewAnimals > 0) {
            animals.add(newAnimal);
            freePlacesForNewAnimals -= 1;
        }
    }

    public void slaughter(){
        Animal leastHungry = new Animal();

        for (int i = 0; i < animals.size()-1; i++) {
            if (animals.get(i).hunger < animals.get(i+1).hunger) {
                leastHungry = animals.get(i);
            }
        }
        animals.remove(leastHungry);
        freePlacesForNewAnimals += 1;
    }
}
