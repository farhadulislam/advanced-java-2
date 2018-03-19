package dramaRating;

import java.util.HashSet;
import java.util.List;

public class Artist extends Staff {

    private String firstName;
    private String lastName;
    private final String unknownLastName;
    private int artistId;
    private static int numOfArtist;
    private static List<Integer> allArtistIds;
    private HashSet<Drama> setOfDramasActedIn;
    private static HashSet<Artist> setOfArtist;
    {
        setOfArtist = new HashSet<>();

    }
    {
        setOfDramasActedIn = new HashSet<Drama>();
    }

    {
        unknownLastName = "Unknown";
    }


    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setOfArtist.add(this);
        numOfArtist++;

    }

    public Artist(String firstName) {
        this.firstName = firstName;
        this.lastName = unknownLastName;
        numOfArtist++;
    }

    public Artist(){
        new Artist("Not provided");
    }

    private static Artist createArtist(String firstName){

        return new Artist(firstName);
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

    public HashSet<Drama> getSetOfDramasActedIn() {
        return setOfDramasActedIn;
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


    public static void  showAllArtist(){

        for(Artist artist:setOfArtist){
            System.out.println(artist.getFirstName());

        }
    }
}
