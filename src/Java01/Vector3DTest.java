package Java01;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Vector3DTest {

    @Test
    public void testGetlengthVector() {
        Vector3D A = new Vector3D();
        assertEquals (0.0, A.getlengthVector());
        Vector3D A1 = new Vector3D(4, 3, 0);
        assertEquals (5, A1.getlengthVector());
        Vector3D A2 = new Vector3D(1, 0, 0 );
        assertEquals (1, A2.getlengthVector());
    }

    @Test
    public void testEqualsVector() {
        Vector3D A = new Vector3D();
        Vector3D B = new Vector3D();
        assertEquals(true, A.equalsVector(B));
        Vector3D A1 = new Vector3D(2, 3, 4);
        Vector3D B1 = new Vector3D(2, 3, 4);
        assertEquals(true, A1.equalsVector(B1));
        Vector3D A2 = new Vector3D(2, 3, 4);
        Vector3D B2 = new Vector3D(2, 3, 5);
        assertEquals(false, A2.equalsVector(B2));
    }
}