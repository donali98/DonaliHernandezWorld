package com.fallout.models.factions;


public class FactionBase {

    private final Double
            healthPoints,
            attackPoints,
            deffensePoints,
            quantity_per_phase;
    private final Integer creation_wating_phases;
    private final Faction faction;
    private final String name;


    protected FactionBase(FactionBaseBuilder builder) {
        this.healthPoints = builder.healthPoints;
        this.attackPoints = builder.attackPoints;
        this.deffensePoints = builder.deffensePoints;
        this.quantity_per_phase = builder.quantity_per_phase;
        this.creation_wating_phases = builder.creation_wating_phases;
        this.faction = builder.faction;
        this.name = builder.name;

    }

    public static FactionBase getProperties(Double healthPoints,
                                            Double deffensePoints,
                                            Double quantity_per_phase,
                                            Integer creation_wating_phases,
                                            Faction faction){
        return new FactionBaseBuilder(healthPoints,deffensePoints,quantity_per_phase,creation_wating_phases, faction).build();

    }

    public Double getHealthPoints() {
        return healthPoints;
    }

    public Double getAttackPoints() {
        return attackPoints;
    }

    public Double getDeffensePoints() {
        return deffensePoints;
    }

    public Double getQuantity_per_phase() {
        return quantity_per_phase;
    }

    public Integer getCreation_wating_phases() {
        return creation_wating_phases;
    }

    public Faction getFaction() {
        return faction;
    }

    public String getName() {
        return name;
    }

    public static class FactionBaseBuilder{
        private Double attackPoints;
        private String name;
        private final Faction faction;

        private final Double
                healthPoints,
                deffensePoints,
                quantity_per_phase;
        private final Integer creation_wating_phases;

        public FactionBaseBuilder(Double healthPoints,
                                  Double deffensePoints,
                                  Double quantity_per_phase,
                                  Integer creation_wating_phases,
                                  Faction faction){
            this.healthPoints = healthPoints;
            this.deffensePoints = deffensePoints;
            this.quantity_per_phase = quantity_per_phase;
            this.creation_wating_phases = creation_wating_phases;
            this.faction = faction;

        }
        public FactionBaseBuilder attackPoints(Double attackPoints){
            this.attackPoints = attackPoints;
            return this;
        }

        public FactionBaseBuilder name(String name){
            this.name = name;
            return this;
        }


        public FactionBase build(){
            FactionBase faction = new FactionBase(this);
            return faction;

        }

    }


}
