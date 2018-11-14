package dramaRating.Controller;

import dramaRating.Model.*;

import java.util.*;

import static dramaRating.Model.DataInsertion.insertRecords;
import static dramaRating.Model.DataInsertion.insertRecords2018;

public class Platform {

    private static TreeMap<String, Double> dramaNameAndRankValue1;
    private static TreeMap<String, Double> dramaNameAndRankValue2;
    static {
        System.out.println("STARTING main method from Platform class");
    }


    public static void main (String [] args){



        //quickStart(); // This method invokes addRecords(), showRecords() and doRanking() methods
        dramaNameAndRankValue1 = new TreeMap<>();
        dramaNameAndRankValue2 = new TreeMap<>();

        //insertRecords();
        insertRecords2018();
        Platform platform1 = new Platform();

        platform1.doRanking2();
        //platform1.doRanking(); // crossed-through due to method being deprecated!

      //platform1.doRankingForAnArtist("Afran");
        //platform1.doRankingForAnArtist("Nisho");
      // platform1.doRankingForAnArtist("Zovan");
        //platform1.doRankingForAnArtist("Safa");
        //platform1.showRecords();


      // sortViewWise();
       //sortLikeWise();


        //IMPORTANT :  Cross checking number of artists instances against Ids created.
      /*  int numOfArtist = Artist.getNumOfArtist();
        System.out.println("Number of all artist : " + numOfArtist);

        HashSet<Artist> setOfArtist = Artist.getSetOfArtist();
        int sizeOfSetOfArtist= setOfArtist.size();
        System.out.println(sizeOfSetOfArtist);
        ArrayList<Integer> allArtistIds = Artist.getAllArtistIds();*/
        //int sizeOfAllArtistIds = allArtistIds.size();
        //System.out.println(sizeOfAllArtistIds);
        System.out.println("EXECUTION ENDED");


        Director dir1 = new Director("Mabrur Rashid", "Bannah");
        System.out.println(dir1.getStaffId() + " " + dir1.getDirectorId() + " " + dir1.getFirstName());
        Artist sampleArtist = new Artist("Name");
        SomeInfo someInfo = (Artist)->{

            System.out.println(Artist.getFirstName());

        };

    }



    public void showRecords(){

        System.out.println("------------------------------------------");
        System.out.println("Now showing all artist from Artist classes");
        Artist.showAllArtist();
        System.out.println("**************************************");

        System.out.println("Now showing all dramas from Drama classes");
        Drama.showAllDramas();
        System.out.println("**************************************");
    }

    @Deprecated
    @SuppressWarnings("unchecked")
    public void doRanking(){

        System.out.println("-------------Ranking in DESCECENDING order--------------------------------------");

        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){

            dramaNameAndRankValue1.put(dramaRecords.getDrama().getDramaName() , dramaRecords.rank1A());
            //dramaNameAndRankValue1.clear();
            //dramaNameAndRankValue1.put(dramaRecords.getDrama().getDramaName(), dramaRecords.rank1());

        }


        Map sortedMap = Ranking.sortByValues(dramaNameAndRankValue1);

       // Ranking.showMap(sortedMap);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

    }

    public void doRanking2(){

        System.out.println("-------------Ranking in ASCECENDING order using rank1B--------------------------".toUpperCase());

        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){

            //Ranking based on views
            //Double viewsAsDouble = Double.valueOf(dramaRecords.getViews());
            //dramaNameAndRankValue2.put(dramaRecords.getDrama().getDramaName() , viewsAsDouble);

            dramaNameAndRankValue2.put(dramaRecords.getDrama().getDramaName() , dramaRecords.rank1B());


        }


        Map sortedMap = Ranking.sortByValues(dramaNameAndRankValue2);

        // Ranking.showMap(sortedMap);

        // Get a set of the entries on the sorted map
        Set set = sortedMap.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        int j=0;
        while(i.hasNext() && j<=Drama.getNumberOfDramas()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
            j++;
        }

    }
    public void doRankingForAnArtist(Artist artist){

        System.out.println("Ranking by rank1B for dramas acted  by "+ artist.getFirstName());
        dramaNameAndRankValue2.clear();

        int numOfDramasActed = 0;
        double score = 0.00;
        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){


            if(dramaRecords.getDrama().getCast().contains(artist)){
                numOfDramasActed++;
                score+=dramaRecords.rank1B();

                dramaNameAndRankValue2.put(dramaRecords.getDrama().getDramaName() , dramaRecords.rank1B());

            }


        }
        if(dramaNameAndRankValue2.isEmpty()){
            System.out.println("No records exits for "+ artist.getFirstName());
        } else {


            Map sortedMap = Ranking.sortByValues(dramaNameAndRankValue2);

            // Ranking.showMap(sortedMap);

            // Get a set of the entries on the sorted map
            Set set = sortedMap.entrySet();

            // Get an iterator
            Iterator i = set.iterator();

            // Display elements
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry) i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }

        }
        if (numOfDramasActed>=1) {
            System.out.println("Acted on " + numOfDramasActed + " dramas");
            System.out.println("Average " + score / numOfDramasActed);
        } else{
            System.out.println("No records for : " + artist.getFirstName());
        }

    }

    public void doRankingForAnArtist(String artistName){

        System.out.println("Starting a search on " +artistName);
        dramaNameAndRankValue2.clear();

        int numOfDramasActed = 0;
        double score = 0.00;
        boolean matchNotFound = true;
        String [] tempNames = {};


        for(DramaRecords dramaRecords: DramaRecords.getAllDramaRecords()){

            for(Artist artist : dramaRecords.getDrama().getCast()){
                if ( artist.getFirstName().startsWith(artistName)|| artist.getLastName().startsWith(artistName)|| artist.getFirstName().matches(artistName)){
                    matchNotFound = false;
                    while(matchNotFound){
                        System.out.println("Found a potential match");
                        break;
                    }
                    System.out.println(artist.getArtistFullName());

                //}
                //if (artist.getFirstName().startsWith(artistName) || artist.getLastName().startsWith(artistName)) {
                    numOfDramasActed++;
                    score += dramaRecords.rank1B();

                    dramaNameAndRankValue2.put(dramaRecords.getDrama().getDramaName(), dramaRecords.rank1B());
               }

            }


        }


        if(dramaNameAndRankValue2.isEmpty()){
            System.out.println("No records exits for " + artistName.toUpperCase());
        } else {


            Map sortedMap = Ranking.sortByValues(dramaNameAndRankValue2);

            // Ranking.showMap(sortedMap);

            // Get a set of the entries on the sorted map
            Set set = sortedMap.entrySet();

            // Get an iterator
            Iterator i = set.iterator();

            // Display elements
            while (i.hasNext()) {
                Map.Entry me = (Map.Entry) i.next();
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }

        }
        if (numOfDramasActed>=1) {
            System.out.println("Acted on " + numOfDramasActed + " dramas");
            System.out.println("Average " + score / numOfDramasActed);
        } else{
            System.out.println("Sorry, Found No records for : " + artistName);
        }

    }




    private static void quickStart(){

        System.out.println("QUICKSTART method.......");
        Platform platform1 = new Platform();
        DataInsertion.insertRecords();
        gap();
        platform1.showRecords();
        gap();
        platform1.doRanking2();
    }

    public static void gap (){
        for (int i= 0; i<=5; i++){
        System.out.println(" ");
        }
    }



}
