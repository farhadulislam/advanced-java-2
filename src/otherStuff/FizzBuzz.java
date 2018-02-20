package otherStuff;

import java.util.Scanner;


public class FizzBuzz {


    private  static int runs = 0;
    public static void main (String [] args){


        System.out.println("Enter a whole number");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            showFizzBuzz(scanner.nextInt());
            System.out.println("Enter another number .. or hit enter to exit");
            break;
        }

    }

    public static void showFizzBuzz(int num){
         runs ++;
        if (num % 3 == 0){

            if(num%5 ==0){

                System.out.println("FizzBuzz");

            } else {

                System.out.println("Fizz");

            }

        } else if (num % 5 == 0){

            System.out.println("Buzz");

        } else {

            System.out.println(num);

        }

    }



}
