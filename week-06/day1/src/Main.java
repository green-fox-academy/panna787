import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        //Exercise 1
        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());

        //Exercise 2
        List<Integer> squaredNumbers = numbers.stream().filter(n -> n>0).map(n -> n*n).collect(Collectors.toList());

        //Exercise 3
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> squareAbove20 = numbers2.stream().filter(n -> n*n > 20).collect(Collectors.toList());



    }
}
