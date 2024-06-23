package org.company;

public class Planet {
    void resolve() {
        System.out.println("Resolve method");
    }

    void cry() {
        System.out.println("Duck cry cry");
    }

    void mashina() {
        System.out.println("vyun vun vun");
    }

    void chicken() {
        System.out.println("kukarya ku");
    }

    public static void main(String[] args) {
        Planet res = new Planet();
        res.resolve();

        Planet duck = new Planet();
        duck.cry();


        Planet mash = new Planet();
        mash.mashina();

        Planet chik = new Planet();
        chik.chicken();
    }
}
