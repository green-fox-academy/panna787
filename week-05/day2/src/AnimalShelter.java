import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalShelter {

    int budget = 50;
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

    public void addAdopter(String name){
        adopters.add(name);
    }

    public Map findNewOwner(){
        Animal animalToAdopt = null;
        String potentialOwner = "";
        Map<String, Animal> ownerAndAnimal = new HashMap<>();

        potentialOwner = adopters.get((int)Math.random() * (adopters.size()-1));
        adopters.remove(potentialOwner);

        while (!animalToAdopt.isAdoptable()){
            animalToAdopt = animals.get((int)Math.random() * (animals.size()-1));
        }

        animals.remove(animalToAdopt);

        ownerAndAnimal.put(potentialOwner, animalToAdopt);

        return ownerAndAnimal;
    }

    public int earnDonation(int amount){
        budget += amount;

        return budget;
    }

    public String toString(){
        String status = "Budget: " + budget + "€, There are " + animals.size() + " animal(s) and " + adopters.size() + " potential adopter(s)";

        for (Animal a: animals
             ) {
            status += a.toString() + "/n";
        }
        return status;
    }

}

