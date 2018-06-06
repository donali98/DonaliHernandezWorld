package com.fallout.models;

import com.fallout.models.factions.definitions.Faction;
import com.fallout.models.resourses.definitions.Resourse;
import com.fallout.models.resourses.definitions.ResourseProperties;

import java.util.ArrayList;

public class Properties {
    /**
     * Atributos basicos para todas los objetos que participan en una partida (requeridos)
     */
    private final String name;
    private final Integer healthPoints;
    private final Faction faction;

    /**
     * Atributos para edificaciones y/o tropas
     */
    private final Resourse productionResourse;
    private final ArrayList<Resourse> requiredResources;
    private final Integer creationWaitingPhases;

    /**
     * Atributo/s solo para las tropas
     */
    private final Integer attackPoints;

    /**
     * Atributos para las edificaciones centros de mando
     */
        private final ArrayList<Resourse> initialResourses;



    private Properties(PropertiesBuilder builder) {
        this.healthPoints = builder.healthPoints;
        this.attackPoints = builder.attackPoints;
        this.creationWaitingPhases = builder.creationWaitingPhases;
        this.faction = builder.faction;
        this.name = builder.name;
        this.requiredResources = builder.requiredResources;
        this.productionResourse = builder.productionResourse;
        this.initialResourses = builder.initialResourses;

    }

    public static PropertiesBuilder getProperties(String name, Faction faction, Integer healthPoints){
                return new PropertiesBuilder(name,faction,healthPoints);
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

    public String getName() {
        return name;
    }


    public ArrayList<Resourse> getRequiredResourses() {
        return requiredResources;
    }

    public ArrayList<Resourse> getInitialResourses() {
        return initialResourses;
    }

    public Resourse getProductionResourse() {
        return productionResourse;
    }

    public ArrayList<Resourse> getRequiredResources() {
        return requiredResources;
    }

    public static class PropertiesBuilder{
        private final String name;
        private  final Faction faction;
        private  final Integer healthPoints;
        private Integer attackPoints , creationWaitingPhases;
        private Resourse productionResourse;
        private ArrayList<Resourse> requiredResources;

        private ArrayList<Resourse> initialResourses;

        public PropertiesBuilder(String name, Faction faction, Integer healthPoints){
            this.name = name;
            this.faction = faction;
            this.healthPoints = healthPoints;
        }


        public PropertiesBuilder attackPoints(Integer attackPoints){
            this.attackPoints = attackPoints;
            return this;
        }

        public PropertiesBuilder creationWaitingPhases(Integer creationWaitingPhases){
            this.creationWaitingPhases = creationWaitingPhases;
            return this;
        }

        public PropertiesBuilder requiredResources(ArrayList<Resourse> requiredResources){
            this.requiredResources = requiredResources;
            return this;
        }
        public PropertiesBuilder productionResourse(Resourse productionResourse){
            this.productionResourse = productionResourse;
            return this;
        }

        public PropertiesBuilder initialResourses(ArrayList<Resourse> initialResourses){
            this.initialResourses = initialResourses;
            return this;
        }


        public Properties build(){
                Properties properties = new Properties(this);
                return properties;
        }

    }


}
