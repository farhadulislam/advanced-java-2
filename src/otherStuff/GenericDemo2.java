package otherStuff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericDemo2 {

    public static void main(String... args){

        Person p1 = new Person("Adil", 32);
        Person p2 = new Person("Nayan", 33);
        Person p3 = new Person("Saikat", 34);
        Person p4 = new Person("Arijit", 31);

        List<Person> personList1 = new ArrayList<>();

        personList1.add(p1);
        personList1.add(p2);
        personList1.add(p3);
        personList1.add(p4);

        Collections.sort(personList1, new AgeComparator());
        System.out.println(personList1);

        Collections.sort(personList1, new ReverseComparator<>(new AgeComparator()));
        System.out.println(personList1);
    }
}


