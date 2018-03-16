package dramaRating;

import junit.framework.TestCase;

public class ArtistTest extends TestCase {
    private Artist testArtist = new Artist("first name", "last name");
    private String firstName = testArtist.getFirstName();
    private String lastName = testArtist.getLastName();

    public void testGetArtistFullName() {
        assertTrue((firstName != null && lastName !=null));
        assertEquals("first name", testArtist.getFirstName());
        assertEquals("last name", testArtist.getLastName());

    }

    public void testGetFirstName() {
        assertEquals("first name", testArtist.getFirstName());
    }

    public void testSetFirstName() {
        testArtist.setFirstName("new first name");
        assertEquals("new first name", testArtist.getFirstName());
    }

    public void testGetLastName() {

        assertEquals("last name", testArtist.getLastName());
    }

    public void testSetLastName() {
        testArtist.setLastName("new last name");
        assertEquals("new last name", testArtist.getLastName());
    }

    public void testGetArtistId() {
        //testArtist.setArtistId(200);
        assertEquals(0 , testArtist.getArtistId());
    }

    public void testSetArtistId() {
        testArtist.setArtistId(200);
        assertEquals(200,testArtist.getArtistId());
    }

   /* public void testGetListOfDramaActedIn() {
    }

    public void testSetListOfDramaActedIn() {
    }*/

    public void testAddDramaToArtistsRecords() {
        testArtist.addDramaToArtistsRecords(new Drama( 1, "mock drama"));
        assertFalse(testArtist.getSetOfDramasActedIn().isEmpty());
    }

    public void testShowDramasWorkedOn() {

        testArtist.showDramasWorkedOn();
    }
}