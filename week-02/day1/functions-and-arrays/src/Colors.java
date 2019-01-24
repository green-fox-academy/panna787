import java.util.Arrays;

public class Colors {

    public static void main(String[] args) {

        String[][] colors = new String[3][5];

        colors[0] = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
        colors[1] = new String[] {"orange red", "red", "tomato"};
        colors[2] = new String[] {"orchid", "violet", "pink", "hot pink"};

        System.out.println(Arrays.toString(colors[1]));


    }
}
