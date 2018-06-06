package com.fallout.models.resourses.definitions;

import com.fallout.models.factions.definitions.Faction;

public class ResourseProperties {
    private final String name;
    private final Faction faction;
    private final Integer amount,amountPerPhase,hqLimit;

    private ResourseProperties(ResourseBuilder builder) {
        this.name = builder.name;
        this.faction =builder.faction;
        this.amount = builder.amount;
        this.amountPerPhase = builder.amountPerPhase;
        this.hqLimit = builder.hqLimit;

    }
    public static ResourseBuilder getResourse(String name,
                                           Faction faction,
                                           Integer amount,
                                           Integer amountPerPhase){
        return new ResourseBuilder(name,faction,amount,amountPerPhase);

    }
    public String getName() {
        return name;
    }

    public Faction getFaction() {
        return faction;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getAmountPerPhase() { return amountPerPhase; }

    public Integer getHqLimit() { return hqLimit; }

    public static class ResourseBuilder{
        private final String name;
        private final Faction faction;
        private final Integer amount,amountPerPhase;
        private Integer hqLimit;

        public ResourseBuilder(String name, Faction faction, Integer amount, Integer amountPerPhase) {
            this.name = name;
            this.faction = faction;
            this.amount = amount;
            this.amountPerPhase = amountPerPhase;
        }

        public ResourseBuilder hqLimit(Integer hqLimit){
            this.hqLimit = hqLimit;
            return this;
        }
        public ResourseProperties build(){
            ResourseProperties resourse = new ResourseProperties(this);
            return resourse;
        }
    }
}
