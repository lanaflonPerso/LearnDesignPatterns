package com.trl.creationTypePatterns.abstractFactory_Factory;

public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();

}
