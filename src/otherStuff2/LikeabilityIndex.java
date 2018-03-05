package otherStuff2;

import java.util.*;

public class LikeabilityIndex {

    public static void main (String [] args ){

        System.out.println("Instantiating drama object");
        Drama drama1 = new Drama(1, "Patriot");
        Drama drama2 = new Drama(2, "Mirror");

        System.out.println("Adding drama records");
        DramaRecords dramaRecords1 = new DramaRecords(drama1, 100, 20, 500);
        DramaRecords dramaRecords2 = new DramaRecords(drama2, 10, 300, 500);


        /**********Collections****/

        Set<Drama> dramaSet1 = new HashSet<>();
        dramaSet1.add(drama1);
        Map<Drama, DramaRecords> dramaMap1 = new LinkedHashMap<>();
        dramaMap1.put(drama1,dramaRecords1);

        /***********************/

        String index1 = dramaRecords1.toString();
        String index2= dramaRecords2.toString();
        System.out.println(index1);
        System.out.println(index2);

        System.out.println("Record no. 1 ");
        System.out.println("Returning a value from calcLiability " + dramaRecords1.calcLikability1());
        System.out.println("Returning a value from calcLiability2 " + dramaRecords1.calcLikability2());
        System.out.println("Returning a value from calcLiability3 " + dramaRecords1.calcLikability3());
        System.out.println(" Percentage of likes ratio for this record against views is :  " + dramaRecords1.getLikesRatio());

        System.out.println("Record no. 2 ");
        System.out.println("Returning a value from calcLiability " + dramaRecords2.calcLikability1());
        System.out.println("Returning a value from calcLiability2 " + dramaRecords2.calcLikability2());
        System.out.println("Returning a value from calcLiability3 " + dramaRecords2.calcLikability3());
        System.out.println(" Percentage of likes ratio for this record against views is :  " + dramaRecords2.getLikesRatio());



       /* System.out.println(dramaRecords1.getDrama().getDramaName());
        System.out.println(dramaRecords1.getViews());
        System.out.println(dramaRecords1.getLikes());
        System.out.println(dramaRecords1.getDislikes());*/


    }
}
