package strings;

public class String1 {

    public static void main(String[] args) {
        String chars = "lln-yoyxyáybhdoihgse";

        System.out.println(xToY(chars));
    }

    public static String xToY(String chars) {
        String stringToReturn = "";

        if (chars.length() > 0) {
            if(chars.endsWith("x")) {
                stringToReturn = xToY(chars.substring(0, chars.length()-1)) + "y";
            } else {
                stringToReturn = xToY(chars.substring(0, chars.length()-1)) + chars.substring(chars.length()-1);
            }
        }
        return stringToReturn;
    }
}
