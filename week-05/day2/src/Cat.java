public class Cat extends Animal{

    String name;

    public Cat(){
        super("Cat", false, (int)((Math.random()) * 6));
    }

    public Cat(String name){
        super(name, false, (int)((Math.random()) * 6));
    }
}
