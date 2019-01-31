package strings;

public class String2 {

    public static void main(String[] args) {
        String chars = "séxddihxé";
        String chars2 = "oghoiénbédo";

        System.out.println(removeXs(chars));
    }

    public static String removeXs(String chars){
        String stringToReturn = "";

        if (chars.length() > 0) {
            if(chars.endsWith("x")) {
                stringToReturn = removeXs(chars.substring(0, chars.length() - 1));
            } else {
                stringToReturn = removeXs(chars.substring(0, chars.length() - 1)) + chars.substring(chars.length() - 1);
            }
        }
        return stringToReturn;
    }
}
