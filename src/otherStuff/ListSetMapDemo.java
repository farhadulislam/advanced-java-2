package otherStuff;

import java.util.*;

public class ListSetMapDemo {

    public static void main(String[] args) {

        List<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(23);
        numbers1.add(330);
        numbers1.add(10);
        numbers1.add(4);
        numbers1.add(33);

        System.out.println("Numbers as entered into ArrayList");
        System.out.print("ArrayList : ");

        for (Integer number : numbers1) {
            System.out.print(number + " ");

        }
            Set<Integer> setOfNumbers1 = new HashSet<>();
            Set<Integer> setOfNumbers2 = new LinkedHashSet<>();
            Set<Integer> setOfNumbers3 = new TreeSet<>();

            setOfNumbers1.addAll(numbers1);
            setOfNumbers2.addAll(numbers1);
            setOfNumbers3.addAll(numbers1);

            showElementsFromSet(setOfNumbers1, "HashSet");
            showElementsFromSet(setOfNumbers2, "LinkedHashSet");
            showElementsFromSet(setOfNumbers3, "TreeSet");


        }

        public static void showElementsFromSet(Set<Integer> setOfNumbers, String type){
            System.out.println(" ");
            System.out.print(type + " : ");
            for (Integer num : setOfNumbers) {
                System.out.print(num + " ");
            }
            System.out.println(" ");
        }
    }

