package view.consoleUi.menu.typesMenu;

import view.consoleUi.ConsoleUI;
import view.consoleUi.interactionConsole.ConsoleReader;
import view.consoleUi.menu.commands.interfaces.Command;
import view.consoleUi.menu.Menu;
import view.consoleUi.menu.commands.BackMenu;
import view.consoleUi.menu.commands.RaffleToys;
import view.consoleUi.menu.commands.ShowRaffledToys;
import view.consoleUi.menu.commands.ShowWin;
import view.consoleUi.menu.commands.interfaces.MenuCloser;


import java.util.ArrayList;


public class ToyRaffleMenu extends Menu implements Command, MenuCloser {
    private boolean isRunning;
    ConsoleUI consoleUI;
    ConsoleReader consoleReader;

    public ToyRaffleMenu(ConsoleUI consoleUI) {
        super(new ArrayList());
        this.consoleUI = consoleUI;
        this.consoleReader = new ConsoleReader();
        this.isRunning = true;
        initCommands();
    }

    private void initCommands() {
        addCommand(new RaffleToys(consoleUI));
        addCommand(new ShowRaffledToys(consoleUI));
        addCommand(new ShowWin(consoleUI));
        addCommand(new BackMenu(this));
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public String getDescription() {
        return "Розыгрыш!";
    }

    @Override
    public void execute() {
        this.isRunning = true;
        while (isRunning()) {
            consoleReader.println(printMenu());
            String choice = consoleReader.input("Выберите пункт меню: ");
            if (checkInputLineMenu(choice) == -1) {
                consoleReader.println("Ошибка ввода");
                continue;
            }
            execute(Integer.parseInt(choice));
        }
    }

    @Override
    public void closeMenu() {
        setRunning(false);
    }
}
