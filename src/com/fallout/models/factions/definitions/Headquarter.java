package com.fallout.models.factions.definitions;

import com.fallout.AbstractFactory;
import com.fallout.FactoryProducer;
import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.controllers.buildings.BuildingsController;
import com.fallout.controllers.factions.HeadquarterActions;
import com.fallout.models.Factories;
import com.fallout.models.buildings.definitions.Building;
import com.fallout.models.resourses.definitions.Resourse;
import java.util.ArrayList;

public class Headquarter implements HeadquarterActions<Building>{

    private Integer level;
    private ArrayList<Resourse> resources;
    private KnownFactions faction;
    private ArrayList<KnownBuildings> crafteableBuilds;
    private ArrayList<Building> builtBuilds;
    private AbstractFactory buildingFactory = FactoryProducer.getFactory(Factories.BUILDING_FACTORY);


    public Headquarter(KnownFactions faction) {
        this.resources = new ArrayList<>();
        this.builtBuilds = new ArrayList<>();

        //nivel inicial del centro de mando
        this.level = 0;
        this.faction = faction;
        setCraftableBuilds();

    }

    public void setBuiltBuilds(ArrayList<Building> builtBuilds) {
        this.builtBuilds = builtBuilds;
    }

    public KnownFactions getFaction() { return faction; }

    public Integer getLevel() {
        return level;
    }

    public ArrayList<Resourse> getResources() {
        return resources;
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
    public boolean addResource(Resourse resource) {
        if(!resources.contains(resource)){
            resources.add(resource);
            return true;
        }
        return false;
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
