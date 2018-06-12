package com.fallout.controllers;

import java.util.ArrayList;

public interface GeneralControllerActions<E,B> {

    boolean add(E type);
     E get(B type);
     ArrayList<E> returnAll();
}
