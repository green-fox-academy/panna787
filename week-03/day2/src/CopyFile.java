import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class CopyFile {
    public static void main(String[] args) {

        copyFile("test.txt", "test2.txt");

    }

    public static Boolean copyFile(String fileNameCopyFrom, String fileNameCopyTo) {

        try {

            Path filepath1 = Paths.get(fileNameCopyFrom);
            Path filepath2 = Paths.get(fileNameCopyTo);

            ArrayList<String> linesToCopy = new ArrayList<>(Files.readAllLines(filepath1));

            Files.write(filepath2, linesToCopy);

            return true;
        } catch (Exception ex) {

            return false;

        }

    }
}
