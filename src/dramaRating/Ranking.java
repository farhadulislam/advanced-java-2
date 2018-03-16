package dramaRating;

import javax.swing.*;
import java.util.*;

public class Ranking {

    public static void main (String [] args ){

        Ranking app1 = new Ranking();
        System.out.println("Instantiating drama object");
        Drama drama1 = new Drama(1, "Patriot");
        Drama drama2 = new Drama(2, "Mirror");
        Drama drama3 = new Drama(3, "Village");
        Drama drama4 = new Drama(4, "Postman");
        Drama drama5 = new Drama(1, "Acknowledgement");
        Drama drama6 = new Drama(2, "Best friend");
        Drama drama7 = new Drama(3, "Cant wait forever");
        Drama drama8 = new Drama(4, "De facto");


        System.out.println("Adding drama records");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 350, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 350, 300, 700);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 400 , 380, 50000);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 300, 300, 50000);
        DramaRecords dramaRecords5 = new DramaRecords(drama5, 3500, 20, 5000);
        DramaRecords dramaRecords6 = new DramaRecords(drama6, 35, 30000, 70000);
        DramaRecords dramaRecords7 = new DramaRecords(drama7, 4000 , 3800, 150000);
        DramaRecords dramaRecords8 = new DramaRecords(drama8, 30045, 300, 2250000);

        /**********Collections****/
        /******ArrayList********/
        ArrayList<Drama> dramaList1 = new ArrayList<>();

        dramaList1.add(drama1);
        dramaList1.add(drama2);
        dramaList1.add(drama3);
        dramaList1.add(drama4);


        /******HashSet********/
        Set<Drama> dramaSet1 = new HashSet<>();
        dramaSet1.add(drama1);
        dramaSet1.add(drama2);
        dramaSet1.add(drama3);
        dramaSet1.add(drama4);
        dramaSet1.add(drama5);
        dramaSet1.add(drama6);
        dramaSet1.add(drama7);
        dramaSet1.add(drama8);

        /******Map********/

        Map<String, Double> dramaMap1 = new TreeMap<>();

        dramaMap1.put(drama1.getDramaName(), dramaRecords1.rank1());
        dramaMap1.put(drama2.getDramaName(), dramaRecords2.rank1());
        dramaMap1.put(drama3.getDramaName(), dramaRecords3.rank1());
        dramaMap1.put(drama4.getDramaName(), dramaRecords4.rank1());
        dramaMap1.put(drama5.getDramaName(), dramaRecords5.rank1());
        dramaMap1.put(drama6.getDramaName(), dramaRecords6.rank1());
        dramaMap1.put(drama7.getDramaName(), dramaRecords7.rank1());
        dramaMap1.put(drama8.getDramaName(), dramaRecords8.rank1());

        Map<String, Double> dramaMap2 = new TreeMap<>();

        dramaMap2.put(drama1.getDramaName(), dramaRecords1.rank2());
        dramaMap2.put(drama2.getDramaName(), dramaRecords2.rank2());
        dramaMap2.put(drama3.getDramaName(), dramaRecords3.rank2());
        dramaMap2.put(drama4.getDramaName(), dramaRecords4.rank2());
        dramaMap2.put(drama5.getDramaName(), dramaRecords5.rank2());
        dramaMap2.put(drama6.getDramaName(), dramaRecords6.rank2());
        dramaMap2.put(drama7.getDramaName(), dramaRecords7.rank2());
        dramaMap2.put(drama8.getDramaName(), dramaRecords8.rank2());

        System.out.println("Now showing elements from a TreeMap using rank1");
        System.out.println(dramaMap1);

        System.out.println("Now showing elements from a TreeMap using rank2");
        System.out.println(dramaMap2);

         showMap(dramaMap1);
    }

    public static void showLikability(DramaRecords dramaRecords){
        System.out.println("................");
        System.out.println("For the following drama :- ");
        System.out.println("**********" + dramaRecords.getDrama().getDramaName() + "**************");

        System.out.println("................");
        System.out.println("Returning a value from calcLiability " + dramaRecords.calcLikability1());
        System.out.println("Returning a value from calcLiability2 " + dramaRecords.calcLikability2());
        System.out.println("Returning a value from calcLiability3 " + dramaRecords.calcLikability3());

        System.out.println("using rank ****************************");
        System.out.println(dramaRecords.rank1());
        System.out.println(" Percentage of likes ratio for this record against views is :  " + dramaRecords.getLikesRatio());

    }

    public static void showMap(Map<String, Double> map){
        ArrayList<Double> value = new ArrayList<>();
        for (Map.Entry<String, Double> entry : map.entrySet())
        {
            value.add(entry.getValue());
            //System.out.println(entry.getKey() + " : " + entry.getValue());

        }
        Collections.sort(value);
        for(Double dub : value ){
            System.out.println(dub);
        }
    }

    public static void addRankValues(ArrayList<Double> rankValueList){

        for (Double list : rankValueList){

            rankValueList.add(list);

        }


    }


    public static void showBasicStat(){

        System.out.println("Stats.....");
        System.out.println("Dramas added : " + Drama.getNumberOfDramas());
        System.out.println("Records added : " + DramaRecords.getNumOfDramaRecords());
    }

    public void showSwingComponent(){
        // Create the frame on the event dispatching thread.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Display();

            }
        });

        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new EventDemo();
            }
        });
    }

}
