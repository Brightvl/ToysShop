package view.consoleUi.interactionConsole.output;

import view.consoleUi.interactionConsole.input.InputReader;

public class OutputReader  {

    InputReader inputReader;

    public OutputReader() {
        this.inputReader = new InputReader();
    }



    public void printLn(String message) {
        System.out.println(message);
    }

    public void print(String message) {
        System.out.print(message);
    }
}
