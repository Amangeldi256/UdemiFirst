package org.company.UdemiUrok.OOP.Abstract;

public class Recipe1 extends AbstractRecipe {

    @Override
    void cleanUp() {
        // TODO Auto-generated method stub
       // super.cleanUp();
        System.out.println("Get the materials");
        System.out.println("Get the utensils");
    }

    @Override
    void doTheDish() {
        // TODO Auto-generated method stub
      //  super.doTheDish();
        System.out.println("Do the dish ");
    }

    @Override
    void getReady() {
        // TODO Auto-generated method stub
       // super.getReady();
        System.out.println("Clean the utensils");
    }
    

}
