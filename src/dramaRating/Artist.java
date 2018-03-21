package dramaRating;

import java.util.*;

public class Artist extends Staff {

    private String firstName;
    private String lastName;
    private  String unknownLastName = "Unknown";
    private int artistId;
    private HashSet<Drama> setOfDramasActedIn = new HashSet<Drama>();

    private static int numOfArtist;
    private static List<Integer> allArtistIds;
    private static HashSet<Artist> setOfArtist =  new HashSet<>();



    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setOfArtist.add(this);
        //System.out.println(setOfArtist);
        numOfArtist++;

    }

    public Artist(String firstName) {
        new Artist(firstName, unknownLastName);
    }

    public Artist(){
        String temporaryName = "NO-NAME-SUPPLIED-"+ Artist.numOfArtist + 1;
        new Artist(temporaryName);
    }

    public static Artist createArtist(String firstName){

        return new Artist(firstName);
    }

    public static Artist createArtist(String firstName, String lastName){

        return new Artist(firstName, lastName);
    }

    public void getArtistFullName(){

        if( this.getLastName()!=unknownLastName){

            System.out.println("FULL NAME : " + this.getFirstName()+ " "+ this.getLastName());

        } else{

            System.out.println("FULL NAME NOT SUPPLIED!");
            System.out.println(this.getFirstName());

        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public void addDramaToArtistsRecords(Drama drama) {

        try{
            setOfDramasActedIn.add(drama);
           } catch(Exception e){

            System.out.println("Drama not added!");
        }
    }



    @Override
    public String toString() {
        return "Artist{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", artistId=" + artistId +
                ", setOfDramasActedIn=" +  getSetOfDramasActedIn() +
                '}';
    }

    @Override
    public void showDramasWorkedOn() {
        System.out.println("Showing dramas acted  by " + this.getFirstName().toUpperCase());
        /*Iterator it = this.setOfDramasActedIn.iterator();
        while(it.hasNext()){
            System.out.println();
        }*/

        for (Drama drama : setOfDramasActedIn){
            System.out.println(drama.getDramaName());
        }

    }

    public HashSet<Drama> getSetOfDramasActedIn() {
        return setOfDramasActedIn;
    }


    public static void  showAllArtist(){

        Set<Artist> treeSet = new TreeSet<>();
        treeSet.addAll(setOfArtist);
        for(Artist artist: treeSet) {
            System.out.println(artist.getFirstName());
        }
    }
}
