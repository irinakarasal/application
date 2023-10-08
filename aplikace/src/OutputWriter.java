import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ArrayList;
public class OutputWriter {
    public  void writeOutput (String outputFileName, List<Integer> numbers) {
        //System.out.println(" tut "  + Arrays.toString(numbers.toArray()));
        List<Integer> printedList = new ArrayList<>();
        if (numbers.size() % 2 == 0) {
            printEvenNumbers(numbers, printedList);
        }
        else {
            printOddNumbers(numbers, printedList);
        }
        printResult(outputFileName, printedList);
    }

    private void printResult(String outputFileName, List<Integer> printedList) {
            if ( outputFileName != null) {
                printIntoOutputFile(outputFileName, printedList);
            }
            else {
                for (Integer num : printedList) {
                    System.out.println(num);
                }
            }
    }

    private void printIntoOutputFile(String outputFileName, List<Integer> printedList) {
        try (PrintWriter printWriter = new PrintWriter(outputFileName)) {
           // System.out.println("TUT TuT" + Arrays.toString(printedList.toArray()) );
            for (Integer num : printedList) {
                printWriter.print(num +  " ");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Output file is not found");
        }
    }

    private void printOddNumbers(List<Integer> numbers, List<Integer> printedList) {
        for (Integer num : numbers) {
            if ( !(num % 2 == 0)) {
                printedList.add(num);
            }
        }
    }

    private void printEvenNumbers(List<Integer> numbers, List<Integer> printedList) {
        for (Integer num : numbers) {
            if ( num % 2 == 0) {
                printedList.add(num);
            }
        }
    }
}
