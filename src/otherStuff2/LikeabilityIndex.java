package otherStuff2;

import java.util.*;

public class LikeabilityIndex {

    public static void main (String [] args ){

        System.out.println("Instantiating drama object");
        Drama drama1 = new Drama(1, "Patriot");
        Drama drama2 = new Drama(2, "Mirror");
        Drama drama3 = new Drama(3, "Village");
        Drama drama4 = new Drama(4, "Postman");

        System.out.println("Adding drama records");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 150, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 10, 300, 500);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 400 , 80, 500);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 1, 300, 500);

        System.out.println("Stats.....");
        System.out.println("Dramas added : " + Drama.getNumberOfDramas());
        System.out.println("Records added : " + DramaRecords.getNumOfDramaRecords());


        /**********Collections****/

        Set<Drama> dramaSet1 = new HashSet<>();
        dramaSet1.add(drama1);
        dramaSet1.add(drama1);

        Map<Drama, DramaRecords> dramaMap1 = new LinkedHashMap<>();
        dramaMap1.put(drama1,dramaRecords1);
        dramaMap1.put(drama2,dramaRecords2);
        dramaMap1.put(drama3,dramaRecords3);
        dramaMap1.put(drama4,dramaRecords4);

        ArrayList<Drama> dramaList1 = new ArrayList<>();
        dramaList1.add(drama1);
        dramaList1.add(drama2);
        dramaList1.add(drama3);
        dramaList1.add(drama4);

        ArrayList<Double> rankValueList1= new ArrayList<>();
        rankValueList1.add(dramaRecords1.rank1());
        rankValueList1.add(dramaRecords2.rank1());
        rankValueList1.add(dramaRecords3.rank1());
        rankValueList1.add(dramaRecords4.rank1());

        ArrayList<Double> rankValueList2= new ArrayList<>();
        rankValueList2.add(dramaRecords1.rank2());
        rankValueList2.add(dramaRecords2.rank2());
        rankValueList2.add(dramaRecords3.rank2());
        rankValueList2.add(dramaRecords4.rank2());





        /***********************/

        String index1 = dramaRecords1.toString();
        String index2= dramaRecords2.toString();
        String index3 = dramaRecords3.toString();
        String index4= dramaRecords4.toString();
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println(index4);

        showLikability(dramaRecords1);
        showLikability(dramaRecords2);
        showLikability(dramaRecords3);
        showLikability(dramaRecords4);

        System.out.println("Show records using map");
        showMap(dramaMap1);


        System.out.println(rankValueList1);
        System.out.println(rankValueList2);


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


}
