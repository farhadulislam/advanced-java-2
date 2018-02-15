package com.islam.farhad.collectionConcept.list;

import java.util.Objects;

public class Product {

    private String productName;
    private int weight;

    Product(String name, int weight){

        this.productName= name;
        this.weight=weight;
    }

    public String getName(){return productName;}

    public int getWeight(){

        return this.weight;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", weight=" + weight +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;
        return productName != null ? productName.equals(product.productName) : product.productName == null;
    }

   /* @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }*/

    public int hashCode() {

        return Objects.hash(productName, weight);
    }

}