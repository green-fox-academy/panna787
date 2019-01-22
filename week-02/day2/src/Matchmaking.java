import java.util.*;

public class Matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> fullList = new ArrayList<>();

        for (int i = 0; i < list1.size() + list2.size(); i++) {
            if (i < list1.size()) {
                fullList.add(list1.get(i));
            } else {
                continue;
            }
            if (i < list2.size()) {
                fullList.add(list2.get(i));
            } else {
                continue;
            }

        }

        return fullList;
    }
}
