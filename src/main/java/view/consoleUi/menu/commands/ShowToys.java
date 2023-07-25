package view.consoleUi.menu.commands;

import view.consoleUi.ConsoleUI;
import view.consoleUi.menu.Command;

public class ShowToys implements Command {
    private ConsoleUI consoleUi;

    public ShowToys(ConsoleUI consoleUi) {
        this.consoleUi = consoleUi;
    }

    @Override
    public String getDescription() {
        return "Показать все виды игрушек";
    }

    @Override
    public void execute() {
        consoleUi.showAllToys();
    }
}
