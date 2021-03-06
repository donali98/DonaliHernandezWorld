package com.fallout.controllers.buildings;

import com.fallout.config.KnownBuildings;
import com.fallout.controllers.GeneralControllerActions;
import com.fallout.models.buildings.definitions.Building;

import java.util.ArrayList;

public class BuildingsController implements GeneralControllerActions<Building,KnownBuildings> {
    private static  BuildingsController buildingsController;
    private static ArrayList<Building> buildings;
    private BuildingsController(){}

    public static BuildingsController getInstance(){
        if(buildingsController==null){
            buildingsController = new BuildingsController();
            buildings = new ArrayList<>();
        }
        return buildingsController;
    }

    @Override
    public boolean addElement(Building type)
    {
        if(!buildings.contains(type)){
            buildings.add(type);
            return true;
        }
        return false;
    }

    @Override
    public Building getElementByName(KnownBuildings type) {
        for(Building building: buildings){
            if(building.getProperties().getBuildName() == type){
                return building;
            }
        }
        return null;
    }

    @Override
    public Building getElementById(Integer type) {
        for (Building building: buildings){
            if(building.getProperties().getElementId().equals(type) ){
                return building;
            }
        }

        return null;
    }

    @Override
    public ArrayList<Building> returnAll() {
        if(!buildings.isEmpty()){
            return  buildings;
        }
        else return null;
    }


}
