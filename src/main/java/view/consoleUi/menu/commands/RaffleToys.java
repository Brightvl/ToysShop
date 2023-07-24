package view.consoleUi.menu.commands;

import view.consoleUi.menu.Command;
import view.consoleUi.ConsoleUI;

public class RaffleToys implements Command {

    private ConsoleUI consoleUi;

    public RaffleToys(ConsoleUI consoleUi) {
        this.consoleUi = consoleUi;
    }

    @Override
    public String getDescription() {
        return "Розыгрыш игрушки";
    }

    @Override
    public void execute() {
        consoleUi.raffleToys();
    }
}
