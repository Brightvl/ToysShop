package view.consoleUi.menu.typesMenu;

import view.consoleUi.ConsoleUI;
import view.consoleUi.interactionConsole.ConsoleReader;
import view.consoleUi.menu.commands.interfaces.Command;
import view.consoleUi.menu.Menu;
import view.consoleUi.menu.commands.*;
import view.consoleUi.menu.commands.BackMenu;
import view.consoleUi.menu.commands.interfaces.MenuCloser;


import java.util.ArrayList;


public class OptionsMenu extends Menu implements Command, MenuCloser {
    ConsoleUI consoleUI;
    private boolean isRunning;
    ConsoleReader consoleReader;

    public OptionsMenu(ConsoleUI consoleUI) {
        super(new ArrayList());
        this.consoleUI = consoleUI;
        this.isRunning = true;
        consoleReader = new ConsoleReader();
        initCommands();
    }

    private void initCommands() {
        addCommand(new ChangeWeightToy(consoleUI));
        addCommand(new BackMenu(this));
    }



    @Override
    public String getDescription() {
        return "Настройки";
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
    public boolean isRunning() {
        return this.isRunning;
    }

    @Override
    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void closeMenu() {
        setRunning(false);
    }
}
