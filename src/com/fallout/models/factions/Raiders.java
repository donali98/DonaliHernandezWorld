package com.fallout.models.factions;

import com.fallout.config.KnownFactions;
import com.fallout.models.factions.definitions.Faction;

public class Raiders extends Faction {
    /***
     *     Se deja como protected por el hecho de que las unicas clases 'autorizadas' para poder crear instancias
     *     de esta clase son los modelos que hereden de la misma
     * @param faction
     */
    protected Raiders(KnownFactions faction) {
        super(faction);
    }
}
