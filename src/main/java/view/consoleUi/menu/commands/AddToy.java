package view.consoleUi.menu.commands;

import view.consoleUi.ConsoleUI;
import view.consoleUi.menu.commands.interfaces.Command;

/**
 * Класс AddToy представляет команду для добавления новой игрушки.
 */
public class AddToy implements Command {
    private ConsoleUI consoleUI;

    public AddToy(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Добавить игрушку в магазин";
    }

    @Override
    public void execute() {
        consoleUI.addToy();
    }
}
