package dramaRating;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Artist extends Staff {

    private String firstName;
    private String lastName;
    private final String unknownLastName;
    private int artistId;
    private static int numOfArtist;
    private static List<Integer> allArtistIds;
    private HashSet<Drama> listOfDramaActedIn;

    {
        unknownLastName = "Unknown";
    }


    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numOfArtist++;

    }

    public Artist(String firstName) {
        this.firstName = firstName;
        this.lastName = unknownLastName;
        numOfArtist++;
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

    public HashSet<Drama> getListOfDramaActedIn() {
        return listOfDramaActedIn;
    }

    public void setListOfDramaActedIn(ArrayList<Drama> listOfDramaActedIn) {
        //this.listOfDramaActedIn = listOfDramaActedIn;
    }

    public void addDramaToArtistsRecords(Drama drama) {
        listOfDramaActedIn = new HashSet<>();
        try{
            listOfDramaActedIn.add(drama);
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
                ", listOfDramaActedIn=" + listOfDramaActedIn +
                '}';
    }

    @Override
    public void showDramasWorkedOn() {

        System.out.println(listOfDramaActedIn.toString());
    }
}
