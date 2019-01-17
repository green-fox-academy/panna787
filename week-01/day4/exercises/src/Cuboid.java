public class Cuboid {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

    public static void main(String[] args) {
        Double a = 12.;
        Double b = 9.;
        Double c = 11.;

        Double surface = (a * b + a * c + b * c) * 2;
        Double volume = a * b * c;

        System.out.println("Surface Area: " + surface);
        System.out.println("Volume: " + volume);
    }
}
