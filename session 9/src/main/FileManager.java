import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {
    private static final String path = "file.txt";
    private static File file;

    public static File getFileInstance() {
        if (file == null) {
            file = new File(path);
        }
        return file;
    }

    public static String readFile(File file) {
        StringBuilder result = new StringBuilder("");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
                result.append(input).append("\n");
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result.toString();

        /*try {
            String string = Arrays.toString(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";*/
    }

    public static void writeFile(File file, String newText, boolean append) {
        //String preText = readFile(file);
        try {
            FileWriter writer = new FileWriter(file, append);
            //writer.write(preText + "\n");
            writer.write(newText + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(File file, boolean append, String... strings) {
        try {
            FileWriter writer = new FileWriter(file, append);
            for (String string : strings) {
                writer.write(string + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
