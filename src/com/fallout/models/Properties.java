package com.fallout.models;

import com.fallout.models.factions.definitions.Faction;

public class Properties {
    //Todos los parametros opcionales
    private final Double healthPoints;//req
    private final Double quantityPerPhase;//req
    private final Integer creationWaitingPhases;//req
    private final Faction faction;//req
    private final String name;//req

    private final Double attackPoints;//op


    private Properties(PropertiesBuilder builder) {
        this.healthPoints = builder.healthPoints;
        this.attackPoints = builder.attackPoints;
        this.quantityPerPhase = builder.quantityPerPhase;
        this.creationWaitingPhases = builder.creationWaitingPhases;
        this.faction = builder.faction;
        this.name = builder.name;

    }

    public static PropertiesBuilder getProperties(String name, Faction faction, Double healthPoints, Double quantityPerPhase, Integer creationWaitingPhases){
                return new PropertiesBuilder(name,faction,healthPoints,quantityPerPhase,creationWaitingPhases);
    }

    public Double getHealthPoints() {
        return healthPoints;
    }

    public Double getAttackPoints() {
        return attackPoints;
    }

    public Double getQuantityPerPhase() {
        return quantityPerPhase;
    }

    public Integer getCreationWaitingPhases() {
        return creationWaitingPhases;
    }

    public Faction getFaction() {
        return faction;
    }

    public String getName() {
        return name;
    }

    public static class PropertiesBuilder{
        private final String name;
        private  final Faction faction;
        private  final Double
                healthPoints,
                quantityPerPhase;
        private  final Integer creationWaitingPhases;


        private  Double attackPoints;


        public PropertiesBuilder(String name, Faction faction, Double healthPoints, Double quantityPerPhase, Integer creationWaitingPhases){
            this.name = name;
            this.faction = faction;
            this.healthPoints = healthPoints;
            this.quantityPerPhase = quantityPerPhase;
            this.creationWaitingPhases =creationWaitingPhases;
        }


        public PropertiesBuilder attackPoints(Double attackPoints){
            this.attackPoints = attackPoints;
            return this;
        }


        public Properties build(){
            Properties properties = new Properties(this);
            return properties;

        }

    }


}
