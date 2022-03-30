package Java01;

import static org.testng.Assert.*;

public class Point3DTest {

    @org.testng.annotations.Test
    public void testPrintPoint() {
        Point3D A = new Point3D();
        assertEquals("(0.0, 0.0, 0.0)", A.printPoint());
        //assertEquals("(0, 0, 0)", A.printPoint());
        //assertEquals("(0., 0., 0.)", A.printPoint());
        //assertEquals("", A.printPoint());

    }

    @org.testng.annotations.Test
    public void testTestEquals() {
        Point3D A = new Point3D();
        Point3D B = new Point3D();
        assertEquals(true, A.equals(B));
        Point3D A1 = new Point3D(2, 3, 4);
        Point3D B1 = new Point3D(2, 3, 4);
        assertEquals(true, A1.equals(B1));
        Point3D A2 = new Point3D(2, 3, 4);
        Point3D B2 = new Point3D(2, 3, 5);
        assertEquals(false, A2.equals(B2));


    }
}