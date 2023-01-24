package com.anzelika.oodp.strategy;

import com.anzelika.oodp.bridge.DogShelterAbstraction;
import com.anzelika.oodp.builder.Dog;

public class Interview implements AdoptionStrategy {

    @Override
    public boolean applyAdoptationStrategy(DogShelterAbstraction dogShelter) {
        // Implementation for interview adoption strategy
        System.out.println(" - ADOPTING STRATEGY: Adopting dog only after interview with person");
        return true;
    }
}