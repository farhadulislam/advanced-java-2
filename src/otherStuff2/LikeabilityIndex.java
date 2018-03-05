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

        System.out.println("Stats.....");
        System.out.println("Number of dramas added so far " + Drama.getNumberOfDramas());
        System.out.println("Number of drama records added so far " + DramaRecords.getNumOfDramaRecords());


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

        showMe(dramaRecords1);
        showMe(dramaRecords2);




       /* System.out.println(dramaRecords1.getDrama().getDramaName());
        System.out.println(dramaRecords1.getViews());
        System.out.println(dramaRecords1.getLikes());
        System.out.println(dramaRecords1.getDislikes());*/


    }

    public static void showMe(DramaRecords dramaRecords){

        System.out.println("For the following drama :- ");
        System.out.println(dramaRecords.getDrama().getDramaName());

        System.out.println("................");
        System.out.println("Returning a value from calcLiability " + dramaRecords.calcLikability1());
        System.out.println("Returning a value from calcLiability2 " + dramaRecords.calcLikability2());
        System.out.println("Returning a value from calcLiability3 " + dramaRecords.calcLikability3());
        System.out.println(" Percentage of likes ratio for this record against views is :  " + dramaRecords.getLikesRatio());

    }
}
