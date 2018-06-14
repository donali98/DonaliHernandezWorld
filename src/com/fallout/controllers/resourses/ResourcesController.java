package com.fallout.controllers.resourses;

import com.fallout.config.KnownResources;
import com.fallout.controllers.GeneralControllerActions;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.ArrayList;

public class ResourcesController implements GeneralControllerActions<Resourse,KnownResources> {
    private ResourcesController(){}
    private static ResourcesController resourcesController;
    private static ArrayList<Resourse> resources;
    public synchronized static ResourcesController getInstance(){
        if(resourcesController == null){
            resourcesController = new ResourcesController();
            resources = new ArrayList<>();
        }
        return resourcesController;
    }

    @Override
    public boolean addElement(Resourse resource) {
        if(!resources.contains(resource)){
            resources.add(resource);
            return true;
        }
        return false;
    }

    @Override
    public Resourse getElementByName(KnownResources type) {
        for (Resourse resourse: resources){
          // if (resourse.g)
        }
        return null;
    }

    @Override
    public Resourse getElementById(Integer type) {
        return null;
    }

    @Override
    public ArrayList<Resourse> returnAll() {
        return null;
    }
}
