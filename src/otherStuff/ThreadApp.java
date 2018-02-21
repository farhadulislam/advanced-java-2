package otherStuff;

public class ThreadApp implements Runnable {

    private static int number = 0;
    public static void main (String args []){

        Thread thread1 = new Thread(new ThreadApp());
        thread1.start();


        Thread thread2 = new Thread(new ThreadApp());
        thread2.start();

    }



    public void run (){

        System.out.println("Thread is running");
        try {
            Thread.sleep(100);
            System.out.println("Thread will now pause");

        } catch (Exception e){
             // Exception will be caught here.
        }
        System.out.println("Thread is running again");
        doWork();


    }

    private void doWork(){

        for (int i=0; i<=10000; i++){
            number ++;
            System.out.println(number);
        }
    }
}
