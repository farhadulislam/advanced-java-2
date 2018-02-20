package otherStuff;

public class ThreadApp2 extends Thread {

    public void run (){
        System.out.println("Thread is running");
        try {
            Thread.sleep(100);
            System.out.println("Thread will now pause");
        } catch (Exception e){
            // Exception will be caught here.
        }
        System.out.println("Thread is running again");
    }
    public static void main (String args []){

        ThreadApp2 thread2 = new ThreadApp2();
        thread2.start();
    }
}
