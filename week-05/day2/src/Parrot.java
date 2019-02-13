public class Parrot extends Animal{

    String name;

    public Parrot(){
        super("Parrot", false, (int)((Math.random()) * 6 + 4));
    }

    public Parrot(String name){
        super(name, false, (int)((Math.random()) * 6 + 4));
    }

}
