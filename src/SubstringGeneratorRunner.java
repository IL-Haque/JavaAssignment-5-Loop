import java.util.List;
import java.util.Scanner;

public class SubstringGeneratorRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        SubstringGenerator generator = new SubstringGenerator(word);

        List<String> substrings = generator.getAllSubstrings();

        System.out.println("Substrings sorted by length:");
        for (String substring : substrings) {
            System.out.println(substring);
        }


        scanner.close();
    }
}
