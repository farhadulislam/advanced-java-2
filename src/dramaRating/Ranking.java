package dramaRating;

import javax.swing.*;
import java.util.*;

public class Ranking {

    public static void main (String [] args ){

        Artist.showAllArtist();
        Ranking app1 = new Ranking();
        Platform platform2 = new Platform();
        platform2.doRanking();
        platform2.addRecords();
        platform2.doRanking();

        //new Display().showSwingComponent();

    }

    public static void showLikability(DramaRecords dramaRecords){
        System.out.println("................");
        System.out.println("For the following drama :- ");
        System.out.println("**********" + dramaRecords.getDrama().getDramaName() + "**************");

        System.out.println("................");
        System.out.println("Returning a value from calcLiability3 " + dramaRecords.measureLikesStrength());

        System.out.println("using rank ****************************");
        System.out.println(dramaRecords.rank1B());
        System.out.println(" Percentage of likes ratio for this record against views is :  " + dramaRecords.getLikesRatio());

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
