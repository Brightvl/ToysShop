package model.shop;


import model.shop.goods.Toy;

import java.io.Serializable;
import java.util.ArrayList;

public class ToyShop implements Serializable {
    private ArrayList<Toy> toysList;
    private RaffleToys raffleToys;

    public ToyShop() {
        this.toysList = new ArrayList<>();
    }

    public void add(Toy toy) {
        toysList.add(toy);

    }

    public ArrayList<Toy> getAllToys() {
        return toysList;
    }

    public void setWeightToy(Toy toy, int weight) {
        toy.setWeight(weight);
    }


}
