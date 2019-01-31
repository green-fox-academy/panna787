package strings;

public class String3 {

    public static void main(String[] args) {
        String chars = "ufutdfjhblg";

        System.out.println(addAsterisks(chars));
    }

    public static String addAsterisks(String chars){
        String stringToReturn = "";
        String charToAdd = "*";

        if (chars.length() > 0){
         stringToReturn = chars.substring(0, 1) + charToAdd  + addAsterisks(chars.substring(1));
        }
        return stringToReturn;
    }
}
