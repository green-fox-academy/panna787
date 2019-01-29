import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class Logs {

    public static void main(String[] args) {

        try {
            Path filePath = Paths.get("log.txt");
            ArrayList<String > logs = new ArrayList<>(Files.readAllLines(filePath));

            System.out.println(calculateGetPostRatio(logs));
            System.out.println(returnUniqueIp(logs));

        } catch (Exception ex) {
            System.err.println("Cannot read log.txt");

        }

    }

    public static ArrayList<String> returnUniqueIp(ArrayList<String> logs){

        String[] splittedLine = new String[3];
        ArrayList<String> allIps = new ArrayList<>();

        for (String line: logs
             ) {
            splittedLine = line.split("   ");
            allIps.add(splittedLine[1]);
        }

        ArrayList<String> uniqueIps = new ArrayList<>();

        for (String line: allIps
             ) {
            if (!uniqueIps.contains(line)) {
                uniqueIps.add(line);
            }

        }
        System.out.println(uniqueIps.size());

        return uniqueIps;
    }

    public static double calculateGetPostRatio(ArrayList<String > logs){
        double gets = 0.;
        double posts = 0;

        for (String line: logs
             ) {
            if (line.endsWith("GET /")) {
                gets++;
            } else if (line.endsWith("POST /")) {
                posts++;
            }
        }

        double getPostRatio = gets / posts * 100;

        return getPostRatio;
    }
}
