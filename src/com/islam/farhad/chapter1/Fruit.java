package com.islam.farhad.chapter1;

public class Fruit {

    public static int numOfFruits;
    private String name ;
    private String colour;
    private double price;

    Fruit(String name, String colour, double price){

        this. name = name;
        this.colour = colour ;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
