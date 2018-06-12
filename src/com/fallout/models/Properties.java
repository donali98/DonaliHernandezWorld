package com.fallout.models;

import com.fallout.config.KnowBuildings;
import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;

import java.util.HashMap;

public class Properties {

    /***
     * Atributo nombre que varia segun el tipo de objeto que se quiere crear
     */
    private final KnowBuildings buildName;

    /**
     * Atributos basicos para todas los objetos que participan en una partida (requeridos)
     */

    private final Integer healthPoints;
    private final Faction faction;

    /**
     * Atributos para edificaciones y/o tropas
     */
    private final Resourse productionResourse;
    private final HashMap<Integer, Resourse > requiredResources;
    private final Integer creationWaitingPhases;
    private final Integer productionAmountPerPhase;
    private final boolean isMine;
    private final Integer elementId;


    /**
     * Atributo/s solo para las tropas
     */
    private final Integer attackPoints;




    private Properties(PropertiesBuilder builder) {
        this.healthPoints = builder.healthPoints;
        this.attackPoints = builder.attackPoints;
        this.creationWaitingPhases = builder.creationWaitingPhases;
        this.faction = builder.faction;
        this.buildName = builder.buildName;
        this.requiredResources = builder.requiredResources;
        this.productionResourse = builder.productionResourse;
        this.productionAmountPerPhase = builder.productionAmountPerPhase;
        this.isMine = builder.isMine;
        this.elementId = builder.elementId;

    }

    public static PropertiesBuilder getProperties(Faction faction, Integer healthPoints, Integer elementId){
        return new PropertiesBuilder(faction,healthPoints,elementId);
    }


    public Integer getHealthPoints() {
        return healthPoints;
    }

    public Integer getAttackPoints() {
        return attackPoints;
    }


    public Integer getCreationWaitingPhases() {
        return creationWaitingPhases;
    }

    public Faction getFaction() {
        return faction;
    }

    public KnowBuildings getBuildName() { return buildName; }

    public Resourse getProductionResourse() {
        return productionResourse;
    }

    public HashMap<Integer, Resourse> getRequiredResources() {
        return requiredResources;
    }

    public Integer getProductionAmountPerPhase() {
        return productionAmountPerPhase;
    }

    public boolean isMine() {
        return isMine;
    }

    public Integer getElementId() { return elementId; }

    public static class PropertiesBuilder{
        private KnowBuildings buildName;
        private  final Faction faction;
        private  final Integer healthPoints;
        private Integer attackPoints , creationWaitingPhases;
        private Resourse productionResourse;
        private HashMap<Integer,Resourse> requiredResources;
        private  Integer productionAmountPerPhase;
        private Boolean isMine;
        private final Integer elementId;

        public PropertiesBuilder( Faction faction, Integer healthPoints,Integer elementId){
            this.faction = faction;
            this.healthPoints = healthPoints;
            this.elementId = elementId;
        }

        public PropertiesBuilder buildName(KnowBuildings buildName){
            this.buildName = buildName;
            return this;
        }

        public PropertiesBuilder attackPoints(Integer attackPoints){
            this.attackPoints = attackPoints;
            return this;
        }

        public PropertiesBuilder creationWaitingPhases(Integer creationWaitingPhases){
            this.creationWaitingPhases = creationWaitingPhases;
            return this;
        }

        public PropertiesBuilder requiredResources(HashMap<Integer,Resourse> requiredResources){
            this.requiredResources = requiredResources;
            return this;
        }
        public PropertiesBuilder productionResourse(Resourse productionResourse){
            this.productionResourse = productionResourse;
            return this;
        }
        public PropertiesBuilder productionAmountPerPhase(Integer productionAmountPerPhase){
            this.productionAmountPerPhase = productionAmountPerPhase;
            return this;
        }

        public PropertiesBuilder isMine(boolean isMine){
            this.isMine = isMine;
            return this;
        }

        public Properties build(){
                Properties properties = new Properties(this);
                return properties;
        }

    }


}
