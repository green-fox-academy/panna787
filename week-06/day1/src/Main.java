import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        //Exercise 1
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());

        //Exercise 2
        List<Integer> squaredNumbers = numbers.stream()
                .filter(n -> n>0)
                .map(n -> n*n)
                .collect(Collectors.toList());

        //Exercise 3
        List<Integer> numbers2 = Arrays.asList(3, 9, 2, 8, 6, 5);
        List<Integer> squareAbove20 = numbers2.stream()
                .filter(n -> n*n > 20)
                .collect(Collectors.toList());

        //Exercise 4
        double average = numbers.stream()
                .filter(n -> n%2 != 0)
                .mapToDouble((n) -> n)
                .summaryStatistics()
                .getAverage();
        //IntSummaryStatistics stats = numbers.stream().filter(n -> n%2 != 0).mapToInt((n) -> n).summaryStatistics();
        System.out.println(average);

        //Exercise 5
        List<Integer> numbers3 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        double sum = numbers3.stream()
                .filter(n -> n%2 != 0)
                .mapToInt((n) -> n)
                .summaryStatistics()
                .getSum();
        System.out.println(sum);

        //Exercise 6 -- 1
        String example = "osdfhUoUOKulb";

        List<Character> upperCaseCharacters = splitStringToCharacters(example).stream()
                .filter(c -> Character.isUpperCase(c))
                .collect(Collectors.toList());

        //Exercise 6 -- 2
        example.chars()
                .filter(c -> Character.isUpperCase(c))
                .forEach(System.out::println);

        //Exercise 7
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        String startingLetter = "A";

        List<String> citiesStartingWith = cities.stream()
                .filter(city -> city.startsWith(startingLetter))
                .collect(Collectors.toList());

        //Exercise 8
        List<Character> charsToConcatenate = Arrays.asList('C', 'm', 'i');
        String concatenatedCharacters = charsToConcatenate.stream()
                .map(c -> c.toString())
                .collect(Collectors.joining());

        System.out.println(concatenatedCharacters);

        //Exercise 9
        Map<Character, Long> numberOfCharacters = splitStringToCharacters(example).stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }

    public static List<Character> splitStringToCharacters(String stringToSplit){
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < stringToSplit.length(); i++) {
            characters.add(stringToSplit.charAt(i));
        }
        return characters;
    }
}
