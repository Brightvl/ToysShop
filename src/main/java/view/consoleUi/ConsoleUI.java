package view.consoleUi;

import model.shop.goods.Toy;
import presenter.Presenter;
import view.View;
import view.consoleUi.interactionConsole.input.InputReader;
import view.consoleUi.interactionConsole.output.OutputReader;
import view.consoleUi.menu.mainMenu.MainMenu;

import java.util.ArrayList;

/**
 * ConsoleUI представляет консольный пользовательский интерфейс для приложения игрушечного магазина.
 * Он реализует интерфейс View и предоставляет методы для взаимодействия с пользователем через консоль.
 */
public class ConsoleUI implements View {

    private Presenter presenter;
    private InputReader inputReader;
    private OutputReader outputReader;
    private MainMenu mainMenu;

    public ConsoleUI() {
        this.inputReader = new InputReader();
        this.outputReader = new OutputReader();
        this.presenter = new Presenter();
        this.mainMenu = new MainMenu(this);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    /**
     * Метод runMainMenu() запускает главное меню.
     * Пользователю выводится список пунктов меню, и программа ожидает ввода выбранного пункта.
     * После выбора пункта меню происходит выполнение соответствующей команды.
     */
    @Override
    public void runProgram() {
        presenter.loadToys();
        runMainMenu();
    }


    private void runMainMenu() {

        while (mainMenu.isRunning()) {
            outputReader.printLn(mainMenu.printMenu());

            String choice = inputReader.input("Выберите пункт меню: ");
            if (mainMenu.checkInputLineMenu(choice) == -1) {
                outputReader.printLn("Ошибка ввода");
                continue;
            }
            mainMenu.execute(Integer.parseInt(choice));
        }

    }

    public void closeProgram() {
        mainMenu.setRunning(false);
    }

    public void raffleToys() {
        presenter.raffleToy();
    }

    public void showAllToys() {
        ArrayList<Toy> allToys = presenter.getAllToys();
        if (allToys.isEmpty()) {
            outputReader.printLn("В магазине нет игрушек.");
            return;
        }
        outputReader.printLn("Список всех игрушек:");
        outputReader.printToyInfo();
        for (Toy toy : allToys) {
            outputReader.printLn(toy.toString());
        }
    }

    public void addToy() {
        String nameToy = inputReader.inputLn("Введите название");
        try {
            int quantity = Integer.parseInt(inputReader.inputLn("Введите количество"));
            int dropFrequency = Integer.parseInt(inputReader.inputLn("Введите шанс выпадения"));
            presenter.addToy(nameToy, quantity, dropFrequency);
        } catch (NumberFormatException numberFormatException) {
            outputReader.printLn("Произошла ошибка");
        }
    }

    public void setWeightToy() {
        String nameToy = inputReader.inputLn("Введите название");
        try {
            int dropFrequency = Integer.parseInt(inputReader.inputLn("Введите шанс выпадения"));
            if (presenter.setWeightToy(nameToy, dropFrequency) == 0)
                outputReader.printLn("Шанс выпадения изменен");
            else outputReader.printLn("Игрушка не найдена");
        } catch (NumberFormatException numberFormatException) {
            outputReader.printLn("Ошибка ввода");
        }
    }

    public void ShowWin() {
        outputReader.printToyInfo();
        for (Toy toy : presenter.showWin()) {
            outputReader.printLn(toy.toString());
        }
    }

    public void getToysQueue() {
        outputReader.printToyInfo();
        for (Toy toy : presenter.getToysQueue()) {
            outputReader.printLn(toy.toString());
        }
    }

}
