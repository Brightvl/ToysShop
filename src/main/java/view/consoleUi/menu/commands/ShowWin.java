package view.consoleUi.menu.commands;

import view.consoleUi.ConsoleUI;
import view.consoleUi.menu.Command;

/**
 * Класс ShowWin представляет команду для показа выигранных игрушек.
 */
public class ShowWin implements Command {

    ConsoleUI consoleUI;

    public ShowWin(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }


    /**
     * @return описание команды для пункта меню
     */
    @Override
    public String getDescription() {
        return "Показать выигранные игрушки";
    }

    /**
     * Метод execute вызывает метод в ConsoleUI для отображения выигранных игрушек.
     */
    @Override
    public void execute() {
        consoleUI.ShowWin();
    }
}
