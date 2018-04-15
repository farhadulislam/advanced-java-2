package dramaRating;

import java.util.*;

public class Artist extends Staff {

    private String firstName;
    private String lastName;
    private  String unknownLastName = "Unknown";
    private int artistId;
    private static int numOfArtist = 0;


    private HashSet<Drama> setOfDramasActedIn = new HashSet<Drama>();
    private static ArrayList<Integer> allArtistIds;
    private static HashSet<Artist> setOfArtist =  new HashSet<>();

    public static int getNumOfArtist() {
        return numOfArtist;
    }
    public static ArrayList<Integer> getAllArtistIds() {
        return allArtistIds;
    }
    public static HashSet<Artist> getSetOfArtist() {
        return setOfArtist;
    }


    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.artistId = numOfArtist+1;
        setOfArtist.add(this);
        numOfArtist++;

    }

    public Artist(String firstName) {
        this.firstName = firstName;
        this.lastName = unknownLastName;
        new Artist(this.firstName, this.lastName);
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

    public static Artist autoCreateArtist(){

        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Ready to take input ..... ");
        System.out.println("ENTER THE FIRST NAME");

        String firstName = scan1.next();
        System.out.println("ENTER THE SECOND NAME : ");
        String lastName = scan2.next();

        System.out.println("I got " + firstName + " " + lastName);


        Artist artist = new Artist(firstName, lastName);

        System.out.println("CREATED! " + "Artist ID :" + artist.getArtistId()+", "+ artist.getFirstName()+ " " + artist.getLastName());
        return  artist;
    }

    public void showArtistFullName(){

        if( this.getLastName()!= null  && this.getLastName()!=unknownLastName  ){

            System.out.println("FULL NAME: " + this.getFirstName()+ " "+ this.getLastName());

        } else{

            System.out.println("ONLY FIRST NAME AVAILABLE for : " + this.getFirstName());

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
    public String getArtistFullName(){

        return this.getFirstName() + " " + this.getLastName();
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
        return this.getArtistId() + ": " + this.getArtistFullName();
    }


    public HashSet<Drama> getSetOfDramasActedIn() {
        return setOfDramasActedIn;
    }

    public void showDramasWorkedOn() {
        if(this.getSetOfDramasActedIn() != null && !this.getSetOfDramasActedIn().isEmpty()){
            if (this.getSetOfDramasActedIn().size()==1){
                System.out.print("Acted  on " + this.getSetOfDramasActedIn().size() + " drama : " );
            }else{

            System.out.print("Acted  on : " + this.getSetOfDramasActedIn().size() + " dramas : " );

            }
            for (Drama drama : setOfDramasActedIn){
                System.out.print(drama.getDramaName() + " | ");
            }
            System.out.println("  ");}


    }


    public static void  showAllArtist(){
        ArrayList<Artist> arrayListOfArtist = new ArrayList<>(Artist.getSetOfArtist());

        for(Artist artist: arrayListOfArtist) {
            System.out.println(artist.getArtistId() + " : " + artist.getArtistFullName());
            artist.showDramasWorkedOn();
        }
        System.out.println(" ");
    }


}