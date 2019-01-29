import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
    public static void main(String[] args) {

        countLinesInFile("exemple.txt");

    }

    public static int countLinesInFile (String fileName) {

        try {
            Path filePath = Paths.get(fileName);
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(filePath));
            int numberOfLines = lines.size();
            return numberOfLines;
        } catch (Exception ex) {
            return 0;
        }

    }
}
