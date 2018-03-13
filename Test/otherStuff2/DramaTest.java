package otherStuff2;

import junit.framework.TestCase;

public class DramaTest extends TestCase {
    Drama dramaTestObj1 = new Drama(2000, "TestDrama");
    public void testGetDramaId() {

        assertEquals(500, dramaTestObj1.getDramaId());

    }

    public void testSetDramaId() {
    }

    public void testGetDramaName() {

        assertEquals("Drama name expected", "TestDrama2", dramaTestObj1.getDramaName());
    }

    public void testSetDramaName() {
    }

    public void testGetDramaRecords() {
    }

    public void testGetDramaRecords1() {
    }

    public void testGetNumberOfDramas() {
    }
}