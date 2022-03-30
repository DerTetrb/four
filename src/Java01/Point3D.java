package Java01;

public class Point3D {
    private double x;
    private double y;
    private double z;


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ(){
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z){
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(){
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    public String printPoint() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    public boolean equals(Point3D T){
        if(this.x == T.getX() && this.y == T.getY() && this.z == T.getZ()){
            return true;
        }
        return false;
    }
}
