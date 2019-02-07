public class Sharpie {

    String color;
    double width;
    double inkAmount;

    public Sharpie (String color, double width) {

        this.color = color;
        this.width = width;
        this.inkAmount = 100;

    }

    public void use(int lengthOfLine) {
        if(inkAmount >= width * lengthOfLine) {
            inkAmount -= width * lengthOfLine;

            System.out.println("Sharpie has been used");
        }else {
            System.out.println("Not enough ink");
        }
    }

}