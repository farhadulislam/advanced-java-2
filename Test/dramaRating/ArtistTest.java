package dramaRating;

import junit.framework.TestCase;

public class ArtistTest extends TestCase {

    public void testGetArtistFullName() {

        Artist testArtist = new Artist("first name", "last name");
        String firstName = testArtist.getFirstName();
        String lastName = testArtist.getLastName();

        assertTrue((firstName != null && lastName !=null));
        assertEquals("first name", testArtist.getFirstName());
        assertEquals("last name", testArtist.getLastName());

    }

    public void testGetFirstName() {
    }

    public void testSetFirstName() {
    }

    public void testGetLastName() {
    }

    public void testSetLastName() {
    }

    public void testGetArtistId() {
    }

    public void testSetArtistId() {
    }

    public void testGetListOfDramaActedIn() {
    }

    public void testSetListOfDramaActedIn() {
    }

    public void testAddDramaToArtistsRecords() {
    }

    public void testShowDramasWorkedOn() {
    }
}