package view.consoleUi.menu.mainMenu;

import view.consoleUi.ConsoleUI;
import view.consoleUi.menu.Menu;
import view.consoleUi.menu.commands.*;

import java.util.Arrays;

/**
 * MainMenu представляет главное меню приложения игрушечного магазина.
 * Он наследует класс Menu и предоставляет команды для взаимодействия с пользователем.
 */
public class MainMenu extends Menu {

    private boolean isRunning;
    public MainMenu(ConsoleUI consoleUi) {
        super(Arrays.asList(
                new RaffleToys(consoleUi),
                new ShowRaffledToys(consoleUi),
                new ShowWin(consoleUi),
                new ChangeWeightToy(consoleUi),
                new AddToy(consoleUi),
                new ShowToys(consoleUi),
                new CloseProgram(consoleUi)));
        setRunning(true);
    }


    public void setRunning(boolean running) {
        this.isRunning = running;
    }


    public boolean isRunning() {
        return this.isRunning;
    }
}
