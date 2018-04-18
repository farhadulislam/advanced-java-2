package dramaRating;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class ArtistTest  {

    public Artist testArtist;
    public String firstName;
    public String lastName ;

   @Before
   public void setUp(){

       testArtist= new Artist("first name", "last name");
       firstName = testArtist.getFirstName();
       lastName = testArtist.getLastName();
    }
    @Test
    public void testGetArtistFullName() {
        assertTrue((firstName != null && lastName !=null));
        assertEquals("first name", testArtist.getFirstName());
        assertEquals("last name", testArtist.getLastName());

    }
    @Test
    public void testGetFirstName() {
        assertEquals("first name", testArtist.getFirstName());
    }
    @Test
    public void testSetFirstName() {
        testArtist.setFirstName("new first name");
        assertEquals("new first name", testArtist.getFirstName());
    }
    @Test
    public void testGetLastName() {

        assertEquals("last name", testArtist.getLastName());
    }
    @Test
    public void testSetLastName() {
        testArtist.setLastName("new last name");
        assertEquals("new last name", testArtist.getLastName());
    }
    @Test
    @Ignore
    public void testGetArtistId() {
        //testArtist.setArtistId(200);
        assertEquals(6 , testArtist.getArtistId());
    }
    @Test
    public void testSetArtistId() {
        testArtist.setArtistId(200);
        assertEquals(200,testArtist.getArtistId());
    }

   /* public void testGetListOfDramaActedIn() {
    }

    public void testSetListOfDramaActedIn() {
    }*/
   @Test
    public void testAddDramaToArtistsRecords() {
        testArtist.addDramaToArtistsRecords(new Drama( 1, "mock drama"));
        assertFalse(testArtist.getSetOfDramasActedIn().isEmpty());
    }
    @Test
    public void testShowDramasWorkedOn() {

        testArtist.showDramasWorkedOn();
    }

    @Test(timeout=200)
    @Ignore
    public void badTest(){
        int value = 0;
        for (int i = 0; i<1000000; i++){
            System.out.println();
            value += i;
        }
    }

    @After
    public void tearDown(){

       System.out.println("After");
    }
}