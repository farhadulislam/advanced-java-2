package com.islam.farhad.collectionConcept.set;

public class ProductFixtures {

    public static Product door = new Product ("Wooden door", 35);
    public static Product floorPanel = new Product ("Floor panel", 25);
    public static Product window = new Product ("Glass Window", 10);

    public static Supplier bobs = new Supplier ("Bob's Household Supplies");
    public static Supplier kates = new Supplier ("Bob's Household Supplies");


    static {

        bobs.products().add(door);
        bobs.products().add(floorPanel);

        kates.products().add(door);
        kates.products().add(floorPanel);


    }

}
