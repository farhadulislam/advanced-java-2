package otherStuff;

import java.util.Scanner;


public class FizzBuzz {


    //private  static int runs = 0;
    private static final int [] numbersEntered  = {1};
    public static void main (String [] args){

        doWork();

        //showEnteredNumbers();


    }

    private static void showFizzBuzz(int num){

        if (isDivisibleByThree(num) && isDivisibleByFive(num)){

                System.out.println("FizzBuzz");

            } else if (isDivisibleByThree(num)){

                System.out.println("Fizz");

            } else if (isDivisibleByFive(num)){

                System.out.println("Buzz");
        } else {
            System.out.println("Not divisible by either 3 or 5 ");
            System.out.println(num);

        }



    }

    private static boolean isDivisibleByThree(int num){

        return num%3 ==0;
    }

    private static boolean isDivisibleByFive(int num){

        return num%5 ==0;
    }

    private static void doWork(){

        System.out.println("Enter a whole number");
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int  number = scanner.nextInt();
            showFizzBuzz(number);
            //numbersEntered[numbersEntered.length + 1]= number;
            System.out.println("Enter another number .. or hit enter to exit");
            break;
        }

    }

    public static void showEnteredNumbers(){

        for ( int i =  0; i<numbersEntered.length; i++){

            System.out.println(numbersEntered[i]);
        }
    }


 /*   public static boolean isANumber(int yourNumber){

        try{
            yourNumber = Integer.parseInt(yourNumber);
        }catch (NumberFormatException ex) {
            //handle exception here
        }
    }*/


}
