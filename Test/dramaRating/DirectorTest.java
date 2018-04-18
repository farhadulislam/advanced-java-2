package dramaRating;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DirectorTest {

    public Director testDirector;
    @Test
    @Before
    public void setUp() {

        testDirector = new Director("first name", "last name");
        System.out.println("Before");

    }

    @Test
    public void getFirstName() {
    }

    @Test
    public void getLastName() {
    }

    @Test
    public void issueStaffId() {
    }

    @Test
    public void getDirectorId() {
    }

    @Test
    public void getStaffId() {
    }

    @Test
    public void getSetOfDramasDirected() {
    }

    @Test
    public void showDramasWorkedOn() {
    }

    @Test
    public void addDramaToThisMembersRecord() {
    }

    @Test
    public void getNumberOfDirectors() {
    }

    @After
    public void tearDown() {
        testDirector = null;
        System.out.println("After");
    }
}