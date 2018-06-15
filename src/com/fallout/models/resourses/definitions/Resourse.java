package com.fallout.models.resourses.definitions;
import com.fallout.config.KnownFactions;
import com.fallout.config.KnownResources;
import com.fallout.controllers.resourses.ResourcesController;

public class Resourse {

    /***
     * No se hizo con el builder de Properties porque las propiedades necesarias de un recurso
     * no es el mismo que los de las propiedades de los elementos como edificaciones, tropas, etc.
     */

    private Integer id;
    private Integer amount;
    private Integer headQuarterStorageLimit;
    private KnownFactions faction;

    public Resourse(  Integer amount, KnownFactions faction, Integer headQuarterStorageLimit) {
        this.id = ResourcesController.getInstance().returnAll() == null ? 1: ResourcesController.getInstance().returnAll().size()+1;
        this.amount = amount;
        this.faction = faction;
        this.headQuarterStorageLimit = headQuarterStorageLimit;
    }

    public Integer getId() {
        return id;
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
