package view.consoleUi.menu.commands;

import view.consoleUi.ConsoleUI;
import view.consoleUi.menu.Command;

public class ShowRaffledToys implements Command {


    private ConsoleUI consoleUi;

    public ShowRaffledToys(ConsoleUI consoleUi) {
        this.consoleUi = consoleUi;
    }

    @Override
    public String getDescription() {
        return "Показать разыгрываемые игрушки";
    }

    @Override
    public void execute() {
        consoleUi.getToysQueue();
    }
}


