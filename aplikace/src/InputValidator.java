
public class InputValidator {
    public String inputFileName;
    public String outputFileName;
    public void checkInput(String[] args) {
        if ( args.length > 2 || args.length == 0) {
            System.out.println("Invalid input");
            System.exit(0);
        }

        if ( ! isInt(args[0])) {
            inputFileName = args[0];
        }

        if (args.length == 2) {
            if ( ! (isInt(args[1]))) {
                outputFileName = args[1];
            }
            else {
                System.out.println("The second parameter should be the path to the output file");
            }
        }
    }
    public boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
