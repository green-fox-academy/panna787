import java.util.List;

public class Fox {

    private String name;
    private int age;
    private String color;

    public Fox(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public static void fillUp(List<Fox> foxes){
        foxes.add(new Fox("Kex", 3, "red"));
        foxes.add(new Fox("Trix", 1, "green"));
        foxes.add(new Fox("Nix", 6, "red"));
        foxes.add(new Fox("Fix", 7, "green"));
        foxes.add(new Fox("Felix", 3, "green"));

    }
}
