import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputReader {
    public List<Integer> numbers = new ArrayList<>();
    void readInput (String inputFileName) {
        if (inputFileName != null) {
            try {
                Scanner scanner = new Scanner(new File(inputFileName));
                readInput(scanner);
            } catch (FileNotFoundException ex) {
                System.out.println("Input file is not found");
            }
        }
        else {
            Scanner scanner = new Scanner(System.in);
            readInput(scanner);
        }

    }
    private void readInput (Scanner scanner) {
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
            else {
                System.out.println("The file must contain only numbers!");
                System.exit(0);
            }
        }
        //System.out.println("a sho tut " + Arrays.toString(numbers.toArray()));
    }
}
