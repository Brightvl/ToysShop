import model.fileManage.BinSerialization;
import model.shop.goods.Toy;
import model.shop.ToyShop;
import view.consoleUi.ConsoleUI;


public class ToyShopApp {
    public static void main(String[] args) {


        ToyShop toyShop = new ToyShop();

        // Добавляем игрушки в магазин
        toyShop.add(new Toy("Мяч", 20, 5));
        toyShop.add(new Toy("Кукла", 30, 8));
        toyShop.add(new Toy("Конструктор", 50, 10));

        BinSerialization binSerialization = new BinSerialization("src/main/java/model/shop/goods/data/toys.bin");
        binSerialization.saveFile(toyShop);

        ConsoleUI consoleUi = new ConsoleUI();

        consoleUi.runProgram();
    }
}