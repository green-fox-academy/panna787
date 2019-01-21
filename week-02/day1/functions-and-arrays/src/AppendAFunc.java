public class AppendAFunc {

    public static String typo = "Chinchill";

    public static String appendAFunc(String word) {

        String fixedWord = word + "a";

        return fixedWord;
    }

    public static void main(String[] args) {

        System.out.println(appendAFunc(typo));

    }
}
