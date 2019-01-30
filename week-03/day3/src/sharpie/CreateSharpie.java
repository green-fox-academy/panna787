package sharpie;

public class CreateSharpie {

    public static void main(String[] args) {

        Sharpie mySharpie = new Sharpie("black", 1.2);

        mySharpie.use();

        System.out.println(mySharpie.inkAmount);
    }




}
