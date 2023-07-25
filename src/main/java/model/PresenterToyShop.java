package model;

import model.fileManage.BinSerialization;
import model.fileManage.interfaces.Loadable;
import model.shop.ToyShop;
import model.shop.goods.Toy;

import java.util.ArrayList;

public class PresenterToyShop {
    private ToyShop toyShop;
    private Loadable loadable;
    private String filePath;

    public PresenterToyShop() {
        this.toyShop = null;
        this.loadable = new BinSerialization(null);
    }

    public void loadFile(String filePath) {
        this.filePath = filePath;
        this.loadable.setFilePath(filePath);
        this.toyShop = (ToyShop) loadable.loadFile();
        Toy.setCounter(checkMaxId(toyShop.getAllToys()));
    }

    public ArrayList<Toy> getAllToys() {
        return toyShop.getAllToys();
    }

    private int checkMaxId(ArrayList<Toy> toysList) {
        return toysList.stream()
                .mapToInt(Toy::getId) // Преобразуем каждый Toy в его id
                .max() // Находим максимальное значение id
                .orElse(0); // Если список пустой, вернуть 0
    }

    public void addToy(String nameToy, int quantity, int dropFrequency) {
        toyShop.add(new Toy(nameToy, quantity, dropFrequency));

    }

    public int setWeightToy(String nameToy, int weight) {
        try {
            getToy(nameToy).setWeight(weight);
            return 0;
        }
        catch (Exception e) {
            return -1;
        }
    }

    public Toy getToy(String nameToy) {
        return getAllToys().stream()
                .filter(toy -> toy.getName().equalsIgnoreCase(nameToy))
                .findFirst()
                .orElse(null);
    }

}

