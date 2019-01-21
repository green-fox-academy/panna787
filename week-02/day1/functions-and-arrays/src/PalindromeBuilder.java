public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(createPalindrome("12345"));


    }

    public static String createPalindrome (String characters) {

        String palindromeString = "";

        for (int i = 0; i < characters.length() * 2; i++) {
            if (i < characters.length()) {
                palindromeString += characters.charAt(i);
            } else {
                palindromeString += characters.charAt(characters.length() * 2 - (i + 1));
            }


        }
        return palindromeString;
    }
}
