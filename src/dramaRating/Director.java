package dramaRating;

import java.util.List;

public class Director extends Staff {

    private String firstName;
    private String lastName;
    private int artistId;
    private static int numOfDirectors;
    private static List<Integer> allDirectorIds;
    private List<Drama> listOfDramasDirectedBy;

    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numOfDirectors++;

    }

    public Director(String firstName) {
        this.firstName = firstName;
        this.lastName = "Unknown";
        numOfDirectors++;
    }

    private void showDramasDirected() {


    }


    public void showDramasWorkedOn() {
        System.out.println(this.listOfDramasDirectedBy.toString());
    }
}
