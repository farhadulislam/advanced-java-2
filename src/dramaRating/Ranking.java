package dramaRating;

import javax.swing.*;
import java.util.*;

public class Ranking {

    public static void main (String [] args ) throws InterruptedException {

        Ranking app1 = new Ranking();
        Platform platform2 = new Platform();

        //platform2.addRecords();
        //platform2.doRanking();

       // platform2.insertRecords();
        //platform2.doRanking2();

        Thread.sleep(100);
        try {
            long start = System.currentTimeMillis( );
            System.out.println(new Date( ) + "\n");

            Thread.sleep(5*60*10);
            System.out.println(new Date( ) + "\n");

            long end = System.currentTimeMillis( );
            long diff = end - start;
            System.out.println("Difference is : " + diff);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }


    }

    public static void showLikability(DramaRecords dramaRecords){

        System.out.println("................");
        System.out.println("For the following drama :- ");
        System.out.println("**********" + dramaRecords.getDrama().getDramaName() + "**************");

        System.out.println("................");
        System.out.println("Likes strength:  " + dramaRecords.measureLikesStrength());

        System.out.println("using rank ****************************");
        System.out.println(dramaRecords.rank1B());

    }

    public static void showMap(Map<String, Double> map){

        ArrayList<Double> value = new ArrayList<>();

        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            value.add(entry.getValue());
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        /*Collections.sort(value);
        for(Double dub : value ){
            System.out.println(dub);
        }*/
    }




}
