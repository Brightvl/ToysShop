package presenter;

import model.PresenterToyShop;
import model.shop.goods.Toy;

import java.util.ArrayList;

public class Presenter {

    private PresenterToyShop presenterToyShop;

    public Presenter() {
        this.presenterToyShop = new PresenterToyShop();
    }

    public ArrayList<Toy> getAllToys() {
        return presenterToyShop.getAllToys();
    }

    public void loadToys() {
        presenterToyShop.loadFile("src/main/java/model/shop/goods/data/toys.bin");
    }

    public void addToy(String nameToy, int quantity, int dropFrequency) {
        presenterToyShop.addToy(nameToy, quantity, dropFrequency);
    }

    public void setWeightToy(Toy toy, int weight) {
        toy.setWeight(weight);
    }

    public int setWeightToy(String nameToy, int dropFrequency) {
        return presenterToyShop.setWeightToy(nameToy, dropFrequency);
    }
}
