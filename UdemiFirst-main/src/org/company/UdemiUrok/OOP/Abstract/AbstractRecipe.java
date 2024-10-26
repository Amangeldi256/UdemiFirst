package org.company.UdemiUrok.OOP.Abstract;

public abstract class AbstractRecipe {

    public void execute() {
        getReady();
        doTheDish();
        cleanUp();
    }

    void getReady();
    void doTheDish();
    void cleanUp();
    
}
