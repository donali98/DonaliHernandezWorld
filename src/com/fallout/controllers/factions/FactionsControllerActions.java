package com.fallout.controllers.factions;

public interface FactionsControllerActions<E> {

    void add(E type);
    E get(int ind);
}
