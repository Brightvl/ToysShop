package view.consoleUi.menu.commands;


import view.consoleUi.menu.Command;
import view.consoleUi.ConsoleUI;

/**
 * Класс CloseProgram представляет команду выхода из программы с сохранением в меню консольного пользовательского интерфейса (UI).
 */
public class CloseProgram implements Command {

    private ConsoleUI consoleUI;

    /**
     * Создает новый объект CloseProgram.
     * @param consoleUI объект ConsoleUI, используемый для завершения программы с сохранением
     */
    public CloseProgram(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    @Override
    public String getDescription() {
        return "Выйти из программы";
    }

    @Override
    public void execute() {
        consoleUI.closeProgram();
    }
}
