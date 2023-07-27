package model.shop.raffle;

import model.shop.goods.Toy;
import model.shop.goods.comparators.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class ToysRaffleList<T extends Toy> {

    PriorityQueue<Toy> toysQueue;
    private Random random;

    public ToysRaffleList(ArrayList<T> toysList) {
        ArrayList<T> copyToysList = new ArrayList<>(toysList);
        this.toysQueue = new PriorityQueue<>(new WeightComparator());
        this.random = new Random();

        Collections.shuffle(copyToysList);

        for (Toy toy : copyToysList) {
            int quantity = toy.getQuantity();
            double probability = (double) toy.getWeight() / 100;
            for (int i = 0; i < quantity; i++) {
                if (random.nextDouble() <= probability) {
                    toysQueue.add(toy);
                }
            }
        }
    }

    /**
     * Добавляет игрушку в список для розыгрыша.
     *
     * @param toy класса Toy
     */
    public void add(Toy toy
    ) {
        toysQueue.add(toy);
    }

    public boolean isEmpty() {
        return !toysQueue.isEmpty();
    }

    public Toy poll() {
        return toysQueue.poll();
    }

    public PriorityQueue<Toy> getToysQueue() {
        return toysQueue;
    }

    public int raffleListSize() {
        return toysQueue.size();
    }
}
