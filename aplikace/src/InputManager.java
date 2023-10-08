public class InputManager {
    String inputFileName;
    String outputFileName;

    public void readInput(String[] args) {
        checkInput(args);
        InputReader inputReader = new InputReader();
        inputReader.readInput(inputFileName);
        OutputWriter inputWriter = new OutputWriter();
        inputWriter.writeOutput(outputFileName, inputReader.numbers);
    }

    private void checkInput(String[] args) {
        InputValidator inputValidator = new InputValidator();
        inputValidator.checkInput(args);
        inputFileName = inputValidator.inputFileName;
        outputFileName = inputValidator.outputFileName;
    }
}
