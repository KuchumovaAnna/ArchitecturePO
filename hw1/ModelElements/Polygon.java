package ModelElements;

import java.util.HashSet;
import ModelElements.Basic.Point3D;

public class Polygon {
    
    private HashSet<Point3D> points;

    public Polygon(HashSet<Point3D> points){
        this.points = points;
    }
    public HashSet<Point3D> getAllPoints(){
        return points;
    }
    public void addPoint(Point3D point){
        this.points.add(point);
    }
    public void removePount(Point3D point){
        this.points.remove(point);
    }
}