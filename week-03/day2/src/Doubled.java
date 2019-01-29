import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;

public class Doubled {
    public static void main(String[] args) {

        decryptDuplicatedChars("duplicated-chars.txt");

    }

    public static void decryptDuplicatedChars(String fileToDecrypt){
        try {

            Path filePath = Paths.get(fileToDecrypt);
            ArrayList<String> doubledFileLines = new ArrayList<>(Files.readAllLines(filePath));
            ArrayList<String> decryptedFileLines = new ArrayList<>();
            String decryptedLine = "";

            for (String line: doubledFileLines) {
                for (int j = 0; j < line.length(); j++) {
                    if (j % 2 == 0) {
                        decryptedLine += line.charAt(j);
                    }
                }
                decryptedFileLines.add(decryptedLine);

            }
            System.out.println(decryptedFileLines);

        } catch (Exception ex) {
            System.err.println("Cannot read " + fileToDecrypt);
        }
    }
}
