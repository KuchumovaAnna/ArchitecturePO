package ModelElements;

import ModelElements.Basic.Angle3D;
import ModelElements.Basic.Point3D;

public class Camera {
    private Point3D position;
    private Angle3D angle;

    public Camera(Point3D position, Angle3D angle) {
        this.position = position;
        this.angle = angle;
    }

    public Angle3D getAngle() {
        return angle;
    }
    public void setAngle(Angle3D newAngle) {
        this.angle = newAngle;
    }
    public Point3D getPosition() {
        return position;
    }
    public void setPosition(Point3D newPosition) {
        this.position = newPosition;
    }
}