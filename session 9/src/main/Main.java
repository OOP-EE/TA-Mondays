import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = FileManager.getFileInstance();
        String text1 = "test 1";
        String text2 = "test 2";

        FileManager.writeFile(file,text1,false);
        FileManager.writeFile(file,text2,false);
        FileManager.writeFile(file,text1,true);
        FileManager.writeFile(file,true, "test 3", "test 4", "test 5");

        String output = FileManager.readFile(file);
        System.out.println(output);

    }
}
