package com.fallout.models.factions.definitions;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.controllers.buildings.BuildingsController;
import com.fallout.controllers.factions.HeadquarterActions;
import com.fallout.controllers.resourses.ResourcesController;
import com.fallout.models.Factories;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.resourses.Oil;
import com.fallout.models.resourses.definitions.Resourse;
import java.util.ArrayList;

public class Headquarter implements HeadquarterActions<Building>{

    private Integer level;
    private ArrayList<Resourse> resources;
    private KnownFactions faction;
    private ArrayList<KnownBuildings> crafteableBuilds;
    private ArrayList<Building> builtBuilds;
    private AbstractFactory buildingFactory = FactoryProducer.getFactory(Factories.BUILDING_FACTORY);
    private AbstractFactory resourceFactory = FactoryProducer.getFactory(Factories.RESOURCES_FACTORY);

    public Headquarter(KnownFactions faction) {
        this.builtBuilds = new ArrayList<>();

        //nivel inicial del centro de mando
        this.level = 0;
        this.faction = faction;
        resources = new ArrayList<>();
        setCraftableBuilds();
        setResources();
    }
    private void setResources(){
        switch (faction){
            case THE_INSTITUTE:
                resources = resourceFactory.getFactionResources(KnownFactions.THE_INSTITUTE) ;
            break;

            case BROTHERHOOD_OF_STEEL:
                resourceFactory.getFactionResources(KnownFactions.BROTHERHOOD_OF_STEEL);
            break;
        }
    }

    private ArrayList<Resourse> filterResource(){
        ArrayList<Resourse> resourses = new ArrayList<>();
        for (Resourse resourse: ResourcesController.getInstance().returnAll()){
            if (resourse.getFaction() == faction){
                resourses.add(resourse);
            }
        }
        return resourses;
    }

    public void setBuiltBuilds(ArrayList<Building> builtBuilds) {
        this.builtBuilds = builtBuilds;
    }

    public KnownFactions getFaction() { return faction; }

    public Integer getLevel() {
        return level;
    }


    public ArrayList<Resourse> getResources(){
        return filterResource();
    }
    public ArrayList<KnownBuildings> getCrafteableBuilds() { return crafteableBuilds; }

    private void setCraftableBuilds() {
        //Definiendo las edificaciones disponibles para crear
        this.crafteableBuilds = new ArrayList<>();
        switch (faction) {
            case THE_INSTITUTE:
                crafteableBuilds.add(KnownBuildings.OIL_MINE);
                crafteableBuilds.add(KnownBuildings.ADVANCED_SYSTEMS);
                crafteableBuilds.add(KnownBuildings.ENCLAVE_REMAINDER_MINE);
            break;
            case BROTHERHOOD_OF_STEEL:
                crafteableBuilds.add(KnownBuildings.ALUMINIUM_MINE);
                crafteableBuilds.add(KnownBuildings.STEEL_MINE);
                crafteableBuilds.add(KnownBuildings.ADHESIVE_BUILDING);
            break;

        }
    }


    @Override
    public void createBuild(KnownBuildings building) {
            this.builtBuilds.add(buildingFactory.getBuilding(building));
    }

    @Override
    public ArrayList<Building> getBuiltBuilds() {
        return this.builtBuilds;
    }


}
