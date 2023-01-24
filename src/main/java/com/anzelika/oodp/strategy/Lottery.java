package com.anzelika.oodp.strategy;

import com.anzelika.oodp.bridge.DogShelterAbstraction;

public class Lottery implements AdoptionStrategy {

    @Override
    public boolean applyAdoptationStrategy(DogShelterAbstraction dogShelter) {
        System.out.println(" - ADOPTING STRATEGY: Adopting dog using lottery between potential owners");
        return true;
    }
}
