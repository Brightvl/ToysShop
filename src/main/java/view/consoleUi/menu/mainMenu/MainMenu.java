package view.consoleUi.menu.mainMenu;

import view.consoleUi.ConsoleUI;
import view.consoleUi.menu.Menu;
import view.consoleUi.menu.commands.CloseProgram;
import view.consoleUi.menu.commands.RaffleToys;

import java.util.Arrays;

public class MainMenu extends Menu {

    private boolean isRunning;
    public MainMenu(ConsoleUI consoleUi) {
        super(Arrays.asList(
                new RaffleToys(consoleUi),
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
