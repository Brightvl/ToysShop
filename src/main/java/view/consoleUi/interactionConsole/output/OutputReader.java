package view.consoleUi.interactionConsole.output;

import view.consoleUi.interactionConsole.input.InputReader;

public class OutputReader  {

    InputReader inputReader;

    public OutputReader() {
        this.inputReader = new InputReader();
    }

    /**
     * Ввод для пользователя с сообщением
     * @param message
     * @return
     */
    public String inputLn(String message) {
        System.out.println(message);
        return inputReader.nextLine();
    }

    public String input(String message) {
        System.out.print(message);
        return inputReader.nextLine();
    }

    public void printLn(String message) {
        System.out.println(message);
    }
}
