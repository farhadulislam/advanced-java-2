package dramaRating;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Director {



    private String firstName;
    private String lastName;
    private int directorId;
    private String staffId;
    private HashSet<Drama> setOfDramasDirected = new HashSet<Drama>();

    private static int numOfDirectors = 0;
    private static List<Integer> allDirectorIds;
    private static ArrayList<Integer> allArtistIds;
    private static HashSet<Artist> setOfArtist =  new HashSet<>();

    //primary constructor
    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.directorId = numOfDirectors+1;
        this.staffId= "D000"+ this.directorId;
        numOfDirectors++;

    }
    public Director(String firstName) {
        this.firstName = firstName;
        this.lastName = "Unknown";
        numOfDirectors++;
        issueStaffId();
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void issueStaffId(){

            this.staffId = "D" + Director.getNumberOfDirectors()+ 1;
            System.out.println("SUCCESS");
    }

    public int getDirectorId() {
        return directorId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
    public HashSet<Drama> getSetOfDramasDirected() {
        return setOfDramasDirected;
    }
    private void showDramasDirected() {
    }

    //@Override
    public void showDramasWorkedOn() {
        if(this.getSetOfDramasDirected() != null && !this.setOfDramasDirected.isEmpty()){
            if (this.getSetOfDramasDirected().size()==1){
                System.out.print("Directed  " + this.getSetOfDramasDirected().size() + " drama : " );
            }else{

                System.out.print("Directed : " + this.getSetOfDramasDirected().size() + " dramas : " );

            }
            for (Drama drama : setOfDramasDirected){
                System.out.print(drama.getDramaName() + " | ");
            }
            System.out.println("  ");
        }
    }

    public void addDramaToThisMembersRecord(Drama drama) {
        this.getSetOfDramasDirected().add(drama);

    }

    public static int getNumberOfDirectors() {
        return numOfDirectors;
    }

}
