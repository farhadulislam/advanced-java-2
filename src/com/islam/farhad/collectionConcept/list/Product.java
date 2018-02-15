package com.islam.farhad.collectionConcept.list;

public class Product {

    private String productName;
    private int weight;

    Product(String name, int weight){

        this.productName= name;
        this.weight=weight;
    }

    public int getWeight(){

        return this.weight;
    }
}