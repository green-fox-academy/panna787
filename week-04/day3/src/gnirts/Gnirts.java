package gnirts;

public class Gnirts implements CharSequence {

    String myString;

    public Gnirts(String myString){
        this.myString = myString;
    }

    @Override
    public int length() {
        return myString.length();
    }

    @Override
    public char charAt(int index) {
        int indexToReturn = myString.length() - 1 - index;

        return myString.charAt(indexToReturn);
    }

    @Override
    public CharSequence subSequence(int start, int end) {


        return null;
    }
}
