package dramaRating;

import java.util.List;

public class Artist extends Staff {

    private String firstName;
    private String lastName;
    private int artistId;
    private static int numOfArtist;
    private static List<Integer> allArtistIds;
    private List<Drama> listOfDramaActedIn;


    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        numOfArtist++;

    }

    public Artist(String firstName) {
        this.firstName = firstName;
        this.lastName = "Unknown";
        numOfArtist++;
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

    public List<Drama> getListOfDramaActedIn() {
        return listOfDramaActedIn;
    }

    public void setListOfDramaActedIn(List<Drama> listOfDramaActedIn) {
        this.listOfDramaActedIn = listOfDramaActedIn;
    }

    public void addDramaToArtistsRecords(Drama drama) {
        this.listOfDramaActedIn.add(drama);
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
