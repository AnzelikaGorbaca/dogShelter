package com.anzelika.oodp.state;

import com.anzelika.oodp.builder.Dog;

/**
 adopt() method can be used to change the state of the dog to AdoptedState, this method can be called when a dog is adopted.

 returnDog() method can be used to change the state of the dog back to AvailableState when a dog is returned.

 train() method can be used to change the state of the dog to TrainingState when a dog is sent for training.**/

public interface DogState {
    void adopt(Dog dog);
    void returnDog(Dog dog);
    void train(Dog dog);
    void sendToQurantine (Dog dog);
}
