package com.islam.farhad.chapter1;

import java.util.ArrayList;
import java.util.List;

public class SimpleApp {

    public static void main (String [] args){

        Fruit fruit1 = new Fruit("mango", "green", 23.09);

        String string1 = fruit1.toString();

        System.out.println(string1);

        List<Fruit> fruitList1 = new ArrayList<>();

        fruitList1.add(fruit1);

        System.out.println(fruitList1);


    }
}
