package com.fallout.models;

import com.fallout.config.KnownBuildings;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.models.factions.definitions.Faction;

import java.util.HashMap;

public class Properties {

    /***
     * Atributo nombre que varia segun el tipo de objeto que se quiere crear
     */
    private final KnownBuildings buildName;

    /**
     * Atributos basicos para la mayoria de los objetos que participan en una partida (requeridos)
     */

    private final Integer healthPoints;
    private final KnownFactions faction;

    /**
     * Atributos para edificaciones y/o tropas
     */
    private final KnownResources productionResourse;
    private final HashMap<KnownResources,Integer > requiredResources;
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

    public static PropertiesBuilder getProperties(KnownFactions faction, Integer healthPoints, Integer elementId){
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

    public KnownFactions getFaction() {
        return faction;
    }

    public KnownBuildings getBuildName() { return buildName; }

    public KnownResources getProductionResourse() {
        return productionResourse;
    }

    public HashMap<KnownResources,Integer> getRequiredResources() {
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

        private  final KnownFactions faction;
        private  final Integer healthPoints;
        private final Integer elementId;


        private Integer attackPoints , creationWaitingPhases;
        private KnownResources productionResourse;
        private HashMap<KnownResources,Integer> requiredResources;
        private  Integer productionAmountPerPhase;
        private Boolean isMine;
        private KnownBuildings buildName;



        public PropertiesBuilder( KnownFactions faction, Integer healthPoints,Integer elementId){
            this.faction = faction;
            this.healthPoints = healthPoints;
            this.elementId = elementId;
        }


        public PropertiesBuilder buildName(KnownBuildings buildName){
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

        public PropertiesBuilder requiredResources(HashMap<KnownResources,Integer> requiredResources){
            this.requiredResources = requiredResources;
            return this;
        }
        public PropertiesBuilder productionResourse(KnownResources productionResourse){
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
