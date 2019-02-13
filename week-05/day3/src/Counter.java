import javax.imageio.IIOException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Counter {

    public static String findMostRainyCity(String fileName) {
        String[][] stringsInFile = splitFileContent(getFileContent(fileName));

        Map<String, Integer> rainyDaysInEachCity = new HashMap();
        for (int i = 0; i < stringsInFile.length; i++) {
            if (rainyDaysInEachCity.containsKey(stringsInFile[i][1]) && stringsInFile[i][2].equals("RAINY")) {
                rainyDaysInEachCity.put(stringsInFile[i][1], (rainyDaysInEachCity.get(stringsInFile[i][1]) + 1));
            } else {
                rainyDaysInEachCity.put(stringsInFile[i][1], 1);
            }
        }

        int maxrainyDaysInEachCity = 0;

        for (String key : rainyDaysInEachCity.keySet()
        ) {
            if (rainyDaysInEachCity.get(key) > maxrainyDaysInEachCity) {
                maxrainyDaysInEachCity = rainyDaysInEachCity.get(key);
            }
        }

        String mostRainyCity = "";
        for (String key : rainyDaysInEachCity.keySet()
        ) {
            if (rainyDaysInEachCity.get(key) == maxrainyDaysInEachCity) {
                mostRainyCity = key;
            }
        }

        return mostRainyCity;
    }

    public static List<String> getFileContent(String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> fileContent = new ArrayList<>();
        try {
            fileContent = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.err.println("File doesn't exist");
        }
        return fileContent;
    }

    public static String[][] splitFileContent(List<String> fileContent) {
        int numberOfLines = fileContent.size();
        int numberOfStringsInOneLine = fileContent.get(0).split(",").length;

        String[][] splittedContent = new String[numberOfLines][numberOfStringsInOneLine];

        for (int i = 0; i < numberOfLines; i++) {
            splittedContent[i] = fileContent.get(i).split(",");

        }
        return splittedContent;
    }
}
