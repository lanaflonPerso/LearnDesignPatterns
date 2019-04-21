package com.trl.creationTypePatterns.abstractFactory_Factory;

public class Main {

    public static void main(String[] args) {

        App app = new App();

        app.createKingdom(App.FactoryMaker.makeFactory(App.FactoryMaker.KingdomType.ELF));
        System.out.println(app.getKing().getDescription());
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());

        app.createKingdom(App.FactoryMaker.makeFactory(App.FactoryMaker.KingdomType.ORC));
        System.out.println(app.getKing().getDescription());
        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
    }

}
