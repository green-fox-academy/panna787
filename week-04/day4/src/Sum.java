import sun.invoke.empty.Empty;

import java.util.ArrayList;

public class Sum {

    public Integer sum(ArrayList<Integer> numbers){
        Integer sum = 0;

        if(numbers.equals(null)){
            throw new NullPointerException("Null value not acceptable");
        }
        if(numbers.size() == 0){
            throw new IllegalArgumentException("List is empty");
        }
        for (Integer number: numbers
             ) {sum += number;

        }
    return sum;

    }
}
