import model.shop.goods.Toy;
import model.shop.ToyShop;
import view.consoleUi.ConsoleUI;

public class ToyShopApp {
    public static void main(String[] args) {


        ToyShop toyShop = new ToyShop();

        // Добавляем игрушки в магазин
        toyShop.addToy(new Toy(1, "Мяч", 5));
        toyShop.addToy(new Toy(2, "Кукла", 8));
        toyShop.addToy(new Toy(3, "Конструктор", 10));

        ConsoleUI consoleUi = new ConsoleUI(toyShop);

        consoleUi.runProgram();
    }
}