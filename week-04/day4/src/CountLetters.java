import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public Map countLettersInString(String string){

        Map<Character, Integer> lettersAndCounts = new HashMap<>();


        char[] chars = string.toCharArray();
        int countLetter = 0;

        for(int i = 0; i < chars.length; i++){
            if(!lettersAndCounts.containsKey(chars[i])){
                lettersAndCounts.put(chars[i], 1);
            }else {
                countLetter = lettersAndCounts.get(chars[i]);
                lettersAndCounts.put(chars[i], countLetter + 1);
            }

        }

        return lettersAndCounts;
    }
}
