package model.shop;

import model.shop.goods.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ToyShop {
    private PriorityQueue<Toy> toysQueue;

    public ToyShop() {
        toysQueue = new PriorityQueue<>((t1, t2) -> t2.getWeight() - t1.getWeight());
    }

    public void addToy(Toy toy) {
        toysQueue.add(toy);
    }

    public Toy getToy() {
        if (toysQueue.isEmpty()) {
            return null;
        }

        int totalWeight = 0;
        for (Toy toy : toysQueue) {
            totalWeight += toy.getWeight();
        }

        Random random = new Random();
        int randomWeight = random.nextInt(totalWeight);

        int cumulativeWeight = 0;
        for (Toy toy : toysQueue) {
            cumulativeWeight += toy.getWeight();
            if (randomWeight < cumulativeWeight) {
                toysQueue.remove(toy);
                return toy;
            }
        }

        return null; // If no toy is selected (should not happen with valid data).
    }

    public void saveToyToFile(Toy toy, String filename) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(toy.getName() + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
