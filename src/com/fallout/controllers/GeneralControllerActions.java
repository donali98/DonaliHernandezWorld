package com.fallout.controllers;

import java.util.ArrayList;

public interface GeneralControllerActions<A,B> {

    boolean addElement(A type);
     A getElementByName(B type);
     A getElementById(Integer type);
     ArrayList<A> returnAll();
}
