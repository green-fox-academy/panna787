import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    int budget;
    List<Animal> animals = new ArrayList<>();
    List<String> adopters = new ArrayList<>();

    public int rescue(Animal animal){
        animals.add(animal);

        return animals.size();
    }

    public int heal(Animal animal){
        int animalHealed = 0;
        Animal animalToHeal = null;

        for (Animal a: animals
             ) {
            if(!a.isHealthy){
                animalToHeal = a;
                break;
            } else {
                continue;
            }
        }

        if(animalToHeal.healCost < budget){
            animalToHeal.heal();
            budget -= animalToHeal.healCost;
            animalHealed = 1;
        } else {
            System.out.println("Not enough money for healing");
        }

        return animalHealed;
    }
}

