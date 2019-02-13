public class Main {

    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.rescue(new Cat());
        animalShelter.rescue(new Dog("Furkesz"));
        animalShelter.rescue(new Parrot());
        System.out.println(animalShelter.toString());
        // Budget: 50€, There are 3 animal(s) and 0 potential adopter(s)
        // Cat is not healthy (3€) and not adoptable
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable

        animalShelter.heal();
        System.out.println(animalShelter.toString());
        // Budget: 47€, There are 3 animal(s) and 0 potential adopter(s)
        // Cat is healthy and adoptable
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable

        animalShelter.addAdopter("Kond");
        System.out.println(animalShelter.toString());
        // Budget: 47€, There are 3 animal(s) and 1 potential adopter(s)
        // Cat is healthy and adoptable
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable

        animalShelter.findNewOwner();
        animalShelter.earnDonation(30);
        System.out.println(animalShelter.toString());
        // Budget: 77€, There are 2 animal(s) and 0 potential adopter(s)
        // Furkesz is not healthy (1€) and not adoptable
        // Parrot is not healthy (7€) and not adoptable
    }

}
