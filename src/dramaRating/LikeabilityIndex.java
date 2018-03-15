package dramaRating;

import javax.swing.*;
import java.util.*;

public class LikeabilityIndex {

    public static void main (String [] args ){

        LikeabilityIndex app1 = new LikeabilityIndex();
        System.out.println("Instantiating drama object");
        Drama drama1 = new Drama(1, "Patriot");
        Drama drama2 = new Drama(2, "Mirror");
        Drama drama3 = new Drama(3, "Village");
        Drama drama4 = new Drama(4, "Postman");


        System.out.println("Adding drama records");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 350, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 350, 300, 700);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 400 , 380, 50000);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 300, 300, 50000);


        /**********Collections****/

        ArrayList<Drama> dramaList1 = new ArrayList<>();

        dramaList1.add(drama1);
        dramaList1.add(drama2);
        dramaList1.add(drama3);
        dramaList1.add(drama4);

        Set<Drama> dramaSet1 = new HashSet<>();
        dramaSet1.add(drama1);
        dramaSet1.add(drama2);
        dramaSet1.add(drama3);
        dramaSet1.add(drama4);

        Map<Drama, DramaRecords> dramaMap1 = new LinkedHashMap<>();
        dramaMap1.put(drama1,dramaRecords1);
        dramaMap1.put(drama2,dramaRecords2);
        dramaMap1.put(drama3,dramaRecords3);
        dramaMap1.put(drama4,dramaRecords4);

        Map<String, Double> dramaMap2 = new TreeMap<>();

        dramaMap2.put(drama1.getDramaName(), dramaRecords1.rank1());
        dramaMap2.put(drama2.getDramaName(), dramaRecords2.rank1());
        dramaMap2.put(drama3.getDramaName(), dramaRecords3.rank1());
        dramaMap2.put(drama4.getDramaName(), dramaRecords4.rank1());

        Map<String, Double> dramaMap3 = new TreeMap<>();

        dramaMap3.put(drama1.getDramaName(), dramaRecords1.rank2());
        dramaMap3.put(drama2.getDramaName(), dramaRecords2.rank2());
        dramaMap3.put(drama3.getDramaName(), dramaRecords3.rank2());
        dramaMap3.put(drama4.getDramaName(), dramaRecords4.rank2());

        for (Map.Entry kv : dramaMap1.entrySet()){
            System.out.println(kv.getKey());
        }

        /**********Some String Representation*************/

        /*String index1 = dramaRecords1.toString();
        String index2= dramaRecords2.toString();
        String index3 = dramaRecords3.toString();
        String index4 = dramaRecords4.toString();

        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        showLikability(dramaRecords1);
        showLikability(dramaRecords2);
        showLikability(dramaRecords3);
        showLikability(dramaRecords4);*/

        /***********************/

        System.out.println("Show records using map");
        showMap(dramaMap1);


        System.out.println("Now showing elements from a TreeMap using rank1");
        System.out.println(dramaMap2);

        System.out.println("Now showing elements from a TreeMap using rank2");
        System.out.println(dramaMap3);

        new LikeabilityIndex().showSwingComponent();

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

    public static void showMap(Map<Drama, DramaRecords> map){

        for (Map.Entry<Drama, DramaRecords> entry : map.entrySet())
        {
            System.out.println(entry.getKey().getDramaId() + " : " + entry.getValue());

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
