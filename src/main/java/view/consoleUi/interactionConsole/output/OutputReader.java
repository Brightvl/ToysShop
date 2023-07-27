package view.consoleUi.interactionConsole.output;

import view.consoleUi.interactionConsole.input.InputReader;

public class OutputReader {

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

    public void printToyInfo() {
        System.out.printf("%-3s %-14s %-2s %-8s%n", "id", "Название", "Количество", "Вес");
    }

    public void printWonToyInfo() {
        System.out.printf("%-3s %-14s %-2s %-8s%n", "№", "Название", "Количество", "Выиграно штук");
    }
}
