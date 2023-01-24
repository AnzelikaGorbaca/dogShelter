package com.anzelika.oodp.strategy;

import com.anzelika.oodp.bridge.DogShelterAbstraction;

/** the AdoptionStrategy interface as the strategy and FirstComeFirstServe, Lottery, and Interview classes as the concrete strategies.
 * This allows you to change the adoption strategy for a dog shelter without changing the dog shelter class itself.**/

public interface AdoptionStrategy {
    public boolean applyAdoptationStrategy(DogShelterAbstraction dogShelter);
}