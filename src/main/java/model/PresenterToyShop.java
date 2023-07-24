package model;

import model.shop.ToyShop;

public class PresenterToyShop {
    private ToyShop toyShop;

    public PresenterToyShop() {
        this.toyShop = new ToyShop();
    }

    public void raffleToys() {
        toyShop.getToy();
    }
}
