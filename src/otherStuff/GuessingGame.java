package otherStuff;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        play();
    }

       public static void play() {

        int actualNumber = (int) (Math.random() * 20 +1);
        System.out.println("Actual number " + actualNumber);
        print("Enter a number between 0 and 20");
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){System.out.println("Wrong input, enter a number only");
            String wrongInput = scanner.next();}

        int usersNumber = scanner.nextInt();


        while (!isNumberWithinRange(usersNumber)) {

            print("Wrong, enter a number within the range");
            usersNumber = scanner.nextInt();

        }
        print("OK!");

        while(!doMatch(usersNumber,actualNumber)){
            print("try again");
            usersNumber=scanner.nextInt();
        }


    }
    /*public static void letMeGuess() {
        print("Guess a number between 1 and 20");
        int keyNumber = 20;
        print("Is it between 11 and 20 ?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if(answer=="Y"){
            print("Is it between 16 and 20 ?");
            String answer2 = scanner.next();
            if(answer=="Y"){

            }
        }
        int actualNumber = (int) (Math.random() * 20 +1);
        System.out.println("Actual number " + actualNumber);
        print("Enter a number between 0 and 20");
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){System.out.println("Wrong input, enter a number only");
            String wrongInput = scanner.next();}

        int usersNumber = scanner.nextInt();


        while (!isNumberWithinRange(usersNumber)) {

            print("Wrong, enter a number within the range");
            usersNumber = scanner.nextInt();

        }
        print("OK!");

        while(!doMatch(usersNumber,actualNumber)){
            print("try again");
            usersNumber=scanner.nextInt();
        }


    }
*/
    public static void print(String string) {
        System.out.println(string.toUpperCase());
    }

    public static boolean isNumberWithinRange(int usersNumber){

        return (usersNumber<=20) && (usersNumber >= 0) ? true : false ;
    }

    public static boolean doMatch(int a, int actualNumber){
        boolean numberMatched = false;
        if (!isNumberWithinRange(a)){
            print("Beyond my range ; match impossible");

        }else if(isNumberWithinRange(a) && a == actualNumber){
            print("you got it man");
            numberMatched = true;
            //return numberMatched;
        } else if (isNumberWithinRange(a) && a<actualNumber){
            print("guess a bigger number");
            //return numberMatched;
        }else if (isNumberWithinRange(a) && a>actualNumber){
            print("guess a smaller number");
            //return numberMatched;
        }
        return numberMatched;
    }
}


