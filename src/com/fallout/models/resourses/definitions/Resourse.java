package com.fallout.models.resourses.definitions;
import com.fallout.config.KnownFactions;

public class Resourse {

    /***
     * No se hizo con el builder de Properties porque las propiedades necesarias de un recurso
     * no es el mismo que los de las propiedades de los elementos como edificaciones, tropas, etc.
     */

    private Integer amount;
    private Integer headQuarterStorageLimit;
    private KnownFactions faction;

    public Resourse(  Integer amount, KnownFactions faction, Integer headQuarterStorageLimit) {
        this.amount = amount;
        this.faction = faction;
        this.headQuarterStorageLimit = headQuarterStorageLimit;
    }

    public Integer getAmount() {
        return amount;
    }

    public KnownFactions getFaction() {
        return faction;
    }

    public Integer getHeadQuarterStorageLimit() {
        return headQuarterStorageLimit;
    }

}
