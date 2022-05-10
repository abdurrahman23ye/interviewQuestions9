import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Q08_ReadFileTxt {
    public static void main(String[] args) throws IOException {
           /*
    1)Create a text file inside this package
    2)Type the following text inside the text file
       Java is easy to learn.
       Learn Java, earn money?
       Java is easy if you study well.
       To learn Java, type codes.
    3)Type code to print every word is used how many times in the text.
   */
        Files.lines(Paths.get("src/Text")).map(t->t.split(" ")).
                flatMap(Arrays::stream).forEach(t-> System.out.println(t));

    }
}
