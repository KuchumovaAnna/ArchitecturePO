package InMemoryModel;

import java.util.ArrayList;

import ModelElements.Camera;
import ModelElements.LightS;
import ModelElements.PolygonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger {
    private ArrayList<PolygonalModel> models;
    private ArrayList<Scene> scenes;
    private ArrayList<LightS> lightS;
    private ArrayList<Camera> cameras;
    
    private ArrayList<IModelChangedObserver> changeObservers;

    public ModelStore(ArrayList<PolygonalModel> models, ArrayList<Scene> scenes, ArrayList<LightS> lightSources,
            ArrayList<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.lightS = lightSources;
        this.cameras = cameras;
    }

    public Scene getSceneById(int index) {
        return scenes.get(index);
    }

    @Override
    public void NotifyChange(IModelChanger sender) {
        for (IModelChangedObserver observer : changeObservers) {
            observer.ApplyUpdateModel();
        }
    }

    public ArrayList<PolygonalModel> getModels() {
        return models;
    }

    public void setModels(ArrayList<PolygonalModel> models) {
        this.models = models;
        NotifyChange(this);
    }

    public void addModels(PolygonalModel model) {
        models.add(model);
        NotifyChange(this);
    }

    public ArrayList<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(ArrayList<Scene> scenes) {
        this.scenes = scenes;
        NotifyChange(this);
    }

    public void addScenes(Scene scene) {
        scenes.add(scene);
        NotifyChange(this);
    }

    public ArrayList<LightS> getLightS() {
        return lightS;
    }

    public void setLightSources(ArrayList<LightS> lightSources) {
        this.lightS = lightSources;
        NotifyChange(this);
    }

    public void addLightS(LightS lightS) {
        lightS.add(lightS);
        NotifyChange(this);
    }

    public ArrayList<Camera> getCameras() {
        return cameras;
    }

    public void setCameras(ArrayList<Camera> cameras) {
        this.cameras = cameras;
        NotifyChange(this);
    }

    public void addCameras(Camera camera) {
        cameras.add(camera);
        NotifyChange(this);
    }

    public void addChangeObservers(IModelChangedObserver changeObserver) {
        changeObservers.add(changeObserver);
    }

    public void removeChangeObservers(IModelChangedObserver changeObserver) {
        changeObservers.remove(changeObserver);
    }
}