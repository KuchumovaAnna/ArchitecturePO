package ModelElements;
import java.util.HashSet;

public class Scene {
    private HashSet<Camera> cameras;
    private HashSet<LightS> lightS;
    private HashSet<PolygonalModel> poligonalModels;

    public void addObject(Object object)  throws Exception {
        if (object instanceof Camera) {
            cameras.add((Camera)object);
        } else if (object instanceof LightS) {
            lightS.add((LightS)object);
        } else if (object instanceof PolygonalModel) {
            poligonalModels.add((PolygonalModel)object);
        } else {
            throw new Exception("Неправильный класс добавляемого объекта");
        }
    }

    public void deleteObject(Object object) throws Exception {
        if (object instanceof Camera) {
            cameras.remove((Camera)object);
        } else if (object instanceof LightS) {
            lightS.remove((LightS)object);
        } else if (object instanceof PolygonalModel) {
            poligonalModels.remove((PolygonalModel)object);
        } else {
            throw new Exception("Неправильный класс добавляемого объекта");
        }
    }
}