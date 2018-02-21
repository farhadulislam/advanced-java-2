package otherStuff;

public class Application {

    private static int numberOfRuns = 0;
    private static boolean appRunning = false;

    public static void main(String[] args) {

        Application app1 = new Application();
        app1.start();

        app1.stop();

    }

    private void start() {
        Application.appRunning = true;
        System.out.println("App started ...");
    }

    private void stop() {
        if(appRunning){
            appRunning = false;
        }
      //appRunning = appRunning ? false : true ;
        System.out.println("App stopped!");
    }

    public static void count() {
        System.out.println("This is a static method");
        numberOfRuns++;
    }

    public int getRunningApps() {

        return numberOfRuns;
    }


}


