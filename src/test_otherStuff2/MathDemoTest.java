package test_otherStuff2;

import junit.framework.TestCase;

public class MathDemoTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testAdd() {
        long result = 9;
        assert(result, add(5, 4));
    }

    public void testSubtract() {
    }


}