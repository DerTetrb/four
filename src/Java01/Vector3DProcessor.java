package Java01;

public class Vector3DProcessor {

    public static Vector3D sumVector3D(Vector3D a, Vector3D b){
        Vector3D AB = new Vector3D();
        AB.setX(a.getX() + b.getX());
        AB.setY(a.getY() + b.getY());
        AB.setZ(a.getZ() + b.getZ());
        return AB;
    }

    public static Vector3D diffVector3D(Vector3D a, Vector3D b){
        Vector3D AB = new Vector3D();
        AB.setX(a.getX() - b.getX());
        AB.setY(a.getY() - b.getY());
        AB.setZ(a.getZ() - b.getZ());
        return AB;
    }

    public static double skalarpr(Vector3D a, Vector3D b){
        return a.getX() * b.getX() + a.getY() * b.getY() + a.getZ() * b.getZ();
    }

    public static Vector3D vectpr(Vector3D a, Vector3D b) {
        Vector3D AB = new Vector3D();
        AB.setX(a.getY() * b.getZ() - b.getY() * a.getZ());
        AB.setY((a.getX() * b.getZ() - b.getX() * a.getZ()) * (-1));
        AB.setZ(a.getX() * b.getY() - b.getX() * a.getY());
        return AB;
    }

    public static boolean isCollinear(Vector3D a, Vector3D b){
        if(a.getX() == 0 && a.getY() == 0 && a.getZ() == 0 || b.getX() == 0 && b.getY() == 0 && b.getZ() == 0){
            throw new IllegalArgumentException("vector(0.0.0)");
        }
        return vectpr(a,b).equalsVector(new Vector3D());
    }

}
