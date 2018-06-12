package com.fallout.controllers.buildings;

import com.fallout.controllers.GeneralControllerActions;
import com.fallout.models.buildings.definitions.Building;

import java.util.ArrayList;

public class BuildingsController implements GeneralControllerActions<Building,String> {
    private static  BuildingsController buildingsController;
    private static ArrayList<Building> buildings;
    private BuildingsController(){}

    public static BuildingsController getInstance(){
        if(buildingsController==null){
            buildingsController = new BuildingsController();
        }
        return buildingsController;
    }

    @Override
    public boolean add(Building type)
    {
        if(!buildings.contains(type)){
            buildings.add(type);
            return true;
        }
        return false;
    }

    @Override
    public Building get(String type) {
        for(Building building: buildings){
            if(building.getProperties().getBuildName().equals(type.toUpperCase())){
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
