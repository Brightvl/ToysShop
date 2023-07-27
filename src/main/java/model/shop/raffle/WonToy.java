package model.shop.raffle;

import model.shop.goods.Toy;

public class WonToy extends Toy {

    int numberOfWon;

    public WonToy(Toy toy) {
        super(toy.getName(), toy.getQuantity(), toy.getWeight());
        this.numberOfWon = 1;
    }

    public void setNumberOfWon(int numberOfWon) {
        this.numberOfWon = numberOfWon;
    }
}
