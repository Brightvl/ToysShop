package model.shop.goods;

import java.io.Serializable;

public class Toy implements Serializable{

    private static int counter = 1;
    private int id;
    private String name;
    private int quantity;
    private int weight;

    public Toy(String name, int quantity, int weight) {
        this.id = counter++;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public static void setCounter(int counter) {
        Toy.counter = counter;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                '}';
    }


}
