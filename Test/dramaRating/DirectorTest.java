package dramaRating;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class DirectorTest {

    public Director testDirector1;
    public Director testDirector2;
    Drama testDrama;

    @BeforeClass
    public static void before (){
        System.out.println("Before class");
    }

    @BeforeClass
    public static void after (){
        System.out.println("After class");
    }


    @Test
    @Before
    @Category(GoodTestCategory.class)
    public void setUp() {

        testDirector1 = new Director("first name", "last name");
        testDirector2 = new Director("first name", "last name");
        String td1firstname = testDirector1.getFirstName();
        String td1Lastname = testDirector1.getLastName();
        String td1StaffId = testDirector1.getStaffId();

        testDrama = new Drama ("Test Drama for Director");

        System.out.println("Before");

    }

    @Test
    public void getFirstName() {

        assertNotNull(testDirector1);
        assertNotSame(testDirector2, testDirector1);

        testDirector1.setFirstName("None");
        assertEquals("None", testDirector1.getFirstName());

    }

    @Test
    public void getLastName() {

        assertNotEquals("New last name", testDirector1.getLastName());
        testDirector1.setLastName("New last name");
        assertEquals("New last name", testDirector1.getLastName());

    }

    @Test
    public void issueStaffId() {

        assertTrue(testDirector1.getStaffId()!=null);
    }

    @Test
    public void getDirectorId() {

        assertTrue(testDirector1.getDirectorId()>0);

    }

    @Test
    public void getStaffId() {

        assertTrue(testDirector1.getStaffId().contains("D"));
        assertFalse(testDirector1.getStaffId().contains("A"));
    }

    @Test
    public void getSetOfDramasDirected() {

        assertNotNull(testDirector1.getSetOfDramasDirected());

    }

    @Test
    public void showDramasWorkedOn() {

        assertNotNull(testDirector1.getSetOfDramasDirected());
    }

    @Test
    public void addDramaToThisMembersRecord() {

        testDirector1.getSetOfDramasDirected().add(testDrama);
        assertTrue(testDirector1.getSetOfDramasDirected().contains(testDrama));
    }

    @Test
    public void getNumberOfDirectors() {

        assertEquals(2, Director.getNumberOfDirectors());
    }

    @After
    public void tearDown() {
        testDirector1 = null;
        System.out.println("After");
    }
}