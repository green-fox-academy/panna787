public class Dog extends Animal {

    String name;

    public Dog(){
        super("Dog", false, (int)((Math.random()) * 7 + 1));
    }

    public Dog(String name){
        super(name,false, (int)((Math.random()) * 7 + 1));
    }
}
