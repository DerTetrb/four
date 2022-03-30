package Java01;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Vector3DProcessorTest {

    @Test
    public void testSumVector3D() {
        Vector3D a = new Vector3D();
        Vector3D b = new Vector3D();
        Vector3D c = Vector3DProcessor.sumVector3D(b, a);
        assertEquals(0, c.getX() );
        assertEquals(0, c.getY() );
        assertEquals(0, c.getZ() );
        Vector3D a1 = new Vector3D(1, 2, 3);
        Vector3D b1 = new Vector3D(-1, -2, -3);
        Vector3D c1 = Vector3DProcessor.sumVector3D(b1, a1);
        assertEquals(0, c1.getX() );
        assertEquals(0, c1.getY() );
        assertEquals(0, c1.getZ() );
        Vector3D a3 = new Vector3D(1, 2, 3);
        Vector3D b3 = new Vector3D(3, 3, 0);
        Vector3D c3 = Vector3DProcessor.sumVector3D(b3, a3);
        assertEquals(4, c3.getX() );
        assertEquals(5, c3.getY() );
        assertEquals(3, c3.getZ() );
    }

    @Test
    public void testDiffVector3D() {
        Vector3D a = new Vector3D();
        Vector3D b = new Vector3D();
        Vector3D c = Vector3DProcessor.diffVector3D(b, a);
        assertEquals(0, c.getX() );
        assertEquals(0, c.getY() );
        assertEquals(0, c.getZ() );
        Vector3D a1 = new Vector3D(1, 2, 3);
        Vector3D b1 = new Vector3D(-1, -2, -3);
        Vector3D c1 = Vector3DProcessor.diffVector3D(b1, a1);
        assertEquals(-2, c1.getX() );
        assertEquals(-4, c1.getY() );
        assertEquals(-6, c1.getZ() );
        Vector3D a3 = new Vector3D(1, 2, 3);
        Vector3D b3 = new Vector3D(3, 3, 0);
        Vector3D c3 = Vector3DProcessor.diffVector3D(b3, a3);
        assertEquals(2, c3.getX() );
        assertEquals(1, c3.getY() );
        assertEquals(-3, c3.getZ() );
    }

    @Test
    public void testSkalarpr() {
        Vector3D a = new Vector3D();
        Vector3D b = new Vector3D();
        assertEquals(0.0, Vector3DProcessor.skalarpr(b, a));
        Vector3D a1 = new Vector3D(1, 2, 3);
        Vector3D b1 = new Vector3D(-1, -2, -3);
        assertEquals(-14, Vector3DProcessor.skalarpr(b1, a1));
        Vector3D a2 = new Vector3D(1, 2, 3);
        Vector3D b2 = new Vector3D(0, 1, 1);
        assertEquals(5, Vector3DProcessor.skalarpr(b2, a2));
    }

    @Test
    public void testVectpr() {
        Vector3D a = new Vector3D();
        Vector3D b = new Vector3D();
        Vector3D c = Vector3DProcessor.vectpr(b, a);
        assertEquals(0, c.getX() );
        assertEquals(0, c.getY() );
        assertEquals(0, c.getZ() );
        Vector3D a1 = new Vector3D(1, 2, 3);
        Vector3D b1 = new Vector3D(-1, -2, -3);
        Vector3D c1 = Vector3DProcessor.vectpr(b1, a1);
        assertEquals(0, c1.getX() );
        assertEquals(0, c1.getY() );
        assertEquals(0, c1.getZ() );
        Vector3D a3 = new Vector3D(1, 2, 3);
        Vector3D b3 = new Vector3D(3, 3, 0);
        Vector3D c3 = Vector3DProcessor.vectpr(a3, b3);
        assertEquals(-9, c3.getX() );
        assertEquals(9, c3.getY() );
        assertEquals(-3, c3.getZ() );

    }

    @Test
    public void testIsCollinear() {
        Vector3D A = new Vector3D(1, 1,1);
        Vector3D B = new Vector3D(1, 1,1 );
        assertEquals(true, Vector3DProcessor.isCollinear(A, B));
        Vector3D A1 = new Vector3D(2, 3, 4);
        Vector3D B1 = new Vector3D(2, 3, 4);
        assertEquals(true, Vector3DProcessor.isCollinear(A1, B1));
        Vector3D A2 = new Vector3D(2, 3, 4);
        Vector3D B2 = new Vector3D(2, 3, 5);
        assertEquals(false, Vector3DProcessor.isCollinear(A2, B2));
    }
}