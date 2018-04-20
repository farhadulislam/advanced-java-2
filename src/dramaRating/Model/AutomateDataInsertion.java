package dramaRating.Model;

import dramaRating.Controller.Platform;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static otherStuff.GuessingGame.print;

public class AutomateDataInsertion {

    public static void  automateAddingArtistData(HashSet<Artist> setOfArtist){
        print("Enter the number of artists details you'd like to add");
        Scanner scan = new Scanner(System.in);

        try{
            int num = scan.nextInt();
            if (num>=1) {
                for (int i = 0; i < num; i++) {
                    setOfArtist.add(Artist.autoCreateArtist());
                }
                for (Artist art1 : Artist.getSetOfArtist()) {

                    System.out.println(art1);
                }
            }
        } catch (Exception e){
            print("Error, enter a number");
        }
    }

    public static void  automateAddingDrama(HashSet<Drama> setOfDramas){
        print("Enter the number of dramas you'd like to add");
        Scanner scan = new Scanner(System.in);

        try{
            int num = scan.nextInt();
            if (num>=1) {
                for (int i = 0; i < num; i++) {

                    setOfDramas.add(Drama.autoCreateDrama());
                }
                for (Drama drama : Drama.getSetOfDramas()) {

                    System.out.println(drama.getDramaId() + ": " + drama.getDramaName());
                }
            }
        } catch (Exception e){
            print("Drama : Error, enter a number");
        }
    }

    public static void  automateAddingDramaRecords(HashSet<DramaRecords> setOfDramarecords){
        print("Enter the number of drama records you'd like to add");
        Scanner scan = new Scanner(System.in);

        try{
            int num = scan.nextInt();
            if (num>=1) {
                for (int i = 0; i < num; i++) {

                    setOfDramarecords.add(DramaRecords.autoCreateDramaRecords());
                }
                for (DramaRecords dramaRecords : DramaRecords.getSetOfDramaRecords()) {

                    System.out.println(dramaRecords.getDrama().getDramaName()+" : "+ dramaRecords.measureLikesStrength());
                    System.out.println(dramaRecords.getDramaNameOfThisRecord()+" : "+ dramaRecords.rank1B());
                }
            }
        } catch (Exception e){
            print("DR : Error, enter a number");
        }


    }

    public void addRandomDummyRecords(int howMany, Platform p1){

        p1.insertArtistsRecordsOnly();
        for (int i =1; i <=howMany; i++){
            Drama drama1 = new Drama("Drama " + i);

            if(!Artist.getSetOfArtist().isEmpty()){

                //drama1.addCast(Artist.getSetOfArtist().iterator().next());
                HashSet<Artist> tempSetOfArtist = Artist.getSetOfArtist();
                List<Artist> sortedArtistList = new ArrayList<>(tempSetOfArtist);

                int numberOfArtist = Artist.getNumOfArtist();
                int randomNumber1 = (int) (Math.random() * numberOfArtist );
                drama1.addCast(sortedArtistList.get(randomNumber1));

                int randomNumber2 = (int) (Math.random() * numberOfArtist);
                while(randomNumber2 == randomNumber1){
                    randomNumber2 = (int) (Math.random() * numberOfArtist);

                }
                drama1.addCast(sortedArtistList.get(randomNumber2));
            }
            new DramaRecords(drama1);
        }

    }

}
