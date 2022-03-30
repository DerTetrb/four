package Java01;

import static java.lang.Math.sqrt;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    public Vector3D() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public Vector3D (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D A, Point3D B){
        this.x = B.getX() - A.getX();
        this.y = B.getY() - A.getY();
        this.z = B.getZ() - A.getZ();

    }

    public Vector3D(Vector3D v){
        this.x = v.getX();
        this.y = v.getY();
        this.z = v.getZ();

    }
    public double getlengthVector(){
        return sqrt(x * x + y * y + z * z);
    }

    public boolean equalsVector(Vector3D A){
        if(this.x == A.getX() && this.y == A.getY() && this.z == A.getZ()){
            return true;
        }
        return false;
    }
    public void printVector3D() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
