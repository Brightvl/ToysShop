package view.consoleUi;

import model.shop.ToyShop;
import model.shop.goods.Toy;
import presenter.Presenter;
import view.View;
import view.consoleUi.interactionConsole.output.OutputReader;
import view.consoleUi.menu.Menu;
import view.consoleUi.menu.mainMenu.MainMenu;

public class ConsoleUI implements View {

    private Presenter presenter;
    OutputReader outputReader;
    MainMenu mainMenu;
    ToyShop toyShop;

    public ConsoleUI(ToyShop toyShop) {
        this.outputReader = new OutputReader();
        this.presenter = new Presenter();
        this.mainMenu = new MainMenu(this);
        this.toyShop = toyShop;
    }

    @Override
    public void runProgram() {
        runMainMenu();
    }


    private void runMainMenu() {

        while (mainMenu.isRunning()) {
            outputReader.printLn(mainMenu.printMenu());

            String choice = outputReader.input("Выберите пункт меню: ");
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

        for (int i = 0; i < 10; i++) {
            Toy prizeToy = toyShop.getToy();
            if (prizeToy != null) {
                toyShop.saveToyToFile(prizeToy, "prize.txt");
                System.out.println("Вы выиграли " + prizeToy.getName() + "!");
            } else {
                System.out.println("Все призовые игрушки разыграны.");
                break;
            }
        }
    }


}
