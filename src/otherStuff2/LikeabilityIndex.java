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
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 100, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 10, 300, 500);
        DramaRecords dramaRecords3 = new DramaRecords(drama3, 200 , 22, 500000);
        DramaRecords dramaRecords4 = new DramaRecords(drama4, 1, 3, 50099999);

        System.out.println("Stats.....");
        System.out.println("Dramas added : " + Drama.getNumberOfDramas());
        System.out.println("Records added : " + DramaRecords.getNumOfDramaRecords());


        /**********Collections****/

        Set<Drama> dramaSet1 = new HashSet<>();
        dramaSet1.add(drama1);
        Map<Drama, DramaRecords> dramaMap1 = new LinkedHashMap<>();
        dramaMap1.put(drama1,dramaRecords1);
        dramaMap1.put(drama2,dramaRecords2);
        dramaMap1.put(drama3,dramaRecords3);
        dramaMap1.put(drama4,dramaRecords4);


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



    }

    public static void showLikability(DramaRecords dramaRecords){
        System.out.println("................");
        System.out.println("For the following drama :- ");
        System.out.println("**********" + dramaRecords.getDrama().getDramaName() + "**************");

        System.out.println("................");
        System.out.println("Returning a value from calcLiability " + dramaRecords.calcLikability1());
        System.out.println("Returning a value from calcLiability2 " + dramaRecords.calcLikability2());
        System.out.println("Returning a value from calcLiability3 " + dramaRecords.calcLikability3());
        System.out.println(" Percentage of likes ratio for this record against views is :  " + dramaRecords.getLikesRatio());

    }

    public static void showMap(Map<Drama, DramaRecords> map){

        for (Map.Entry<Drama, DramaRecords> entry : map.entrySet())
        {
            System.out.println(entry.getKey().getDramaId() + " : " + entry.getValue());
        }
    }


}
