package strings;

public class String2 {

    public static String removeXs(String chars){
        String stringToReturn = "";

        if (chars.length() > 0) {
            if(chars.endsWith("x")) {
                chars = chars.substring(0, chars.length() - 1);
                stringToReturn = removeXs(chars);
            } else {

                stringToReturn = removeXs(chars);
            }
        }
        return stringToReturn;
    }
}
