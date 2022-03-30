package Java01;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Vector3DArrayTest {

    @Test
    public void testMaxVectorLength() {
        Vector3DArray v = new Vector3DArray(5);
        Vector3D w =new Vector3D(3,4, 0);
        v.set(w, 3);
        assertEquals(5, v.maxVectorLength());
    }

    @Test
    public void testContains() {
        Vector3DArray v = new Vector3DArray(5);
        Vector3D w =new Vector3D(3,4, 0);
        Vector3D w1 =new Vector3D(3,4, 0);
        v.set(w, 3);
        assertEquals(3, v.contains(w1));
        Vector3DArray vv = new Vector3DArray(7);
        Vector3D ww =new Vector3D(3,4, 0);
        Vector3D ww1 =new Vector3D(3,4, 0);
        vv.set(ww, 6);
        assertEquals(6, vv.contains(ww1));
    }

    @Test
    public void testLength() {
        Vector3DArray v = new Vector3DArray(5);
        assertEquals(5, v.length());
        Vector3DArray vv = new Vector3DArray(7);
        assertEquals(7, vv.length());
        Vector3DArray vv1 = new Vector3DArray(1);
        assertEquals(1, vv1.length());
    }

    @Test
    public void testPointSwap() {
        Vector3DArray v = new Vector3DArray(5);
        Vector3D w =new Vector3D(2,2, 2);
        Vector3D w1 =new Vector3D(3,4, 0);
        v.set(w, 3);
        v.set(w1, 1);
        Point3D A = new Point3D(1, 1, 1);

        Point3D[] arr = new Point3D[5];
        //arr[0] = new Point3D(4, 5, 1);
        //arr[2] = new Point3D(4, 5, 1);
        arr = v.pointSwap(A);

        assertEquals(4, arr[1].getX());
        assertEquals(5, arr[1].getY());
        assertEquals(1, arr[1].getZ());
        assertEquals(3, arr[3].getX());
        assertEquals(3, arr[3].getY());
        assertEquals(3, arr[3].getZ());

    }

    @Test
    public void testSumAllVectors() {
        Vector3DArray v = new Vector3DArray(5);
        Vector3D w =new Vector3D(2,2, 2);
        Vector3D w1 =new Vector3D(3,4, 0);
        v.set(w, 3);
        v.set(w1, 1);
        Vector3D w2 = new Vector3D();
        w2 = v.sumAllVectors();
        w2.printVector3D();
    }

    @Test
    public void testLineCombination() {
        double[] ar = {2, 4, 1};
        Vector3DArray v = new Vector3DArray(3);
        Vector3D w =new Vector3D(2,2, 2);
        Vector3D w1 =new Vector3D(3,4, 0);
        v.set(w, 1);
        v.set(w1, 0);
        Vector3D u = new Vector3D(14,16, 8);
        assertEquals(v.lineCombination(ar).equalsVector(u), true);

    }
}