package otherStuff2;

import junit.framework.TestCase;

public class DramaTest extends TestCase {

    private Drama dramaTestObj1 = new Drama(1000, "Apple");
    private Drama dramaTestObj2 = new Drama(2000, "Banana");

    public void testGetDramaId() {

        dramaTestObj1.setDramaId(1001);
        assertEquals(1001, dramaTestObj1.getDramaId());
    }

    public void testSetDramaId() {

        dramaTestObj1.setDramaId(12);
        assertEquals(12, dramaTestObj1.getDramaId());
    }

    public void testGetDramaName() {
        dramaTestObj1.setDramaName("Orange");
        assertEquals("Drama name expected ", "Orange", dramaTestObj1.getDramaName());
    }

    public void testSetDramaName() {
        dramaTestObj2.setDramaName("Milkshake");
        assertTrue(dramaTestObj2.getDramaName()=="Milkshake");
    }

    public void testGetDramaRecords() {

        assertEquals(" ", dramaTestObj1);
    }


    public void testGetNumberOfDramas() {

        assertEquals("string", Drama.getNumberOfDramas());
    }

    public void setUp() throws Exception {
        super.setUp();
    }
}