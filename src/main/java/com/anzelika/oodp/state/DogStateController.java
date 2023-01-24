package com.anzelika.oodp.state;

import com.anzelika.oodp.builder.Dog;
/**DogStateController class to manage the state of a dog.
 * The AdoptedState, AvailableState, QuarantineState and TrainedState classes as the concrete states.
 * This allows to change the behavior of a dog depending on its current state.**/

public class DogStateController {

    private DogState state = new AvailableState();

    public void adopt(Dog dog) {
        state.adopt(dog);
        setState(new AdoptedState());
    }

    public void returnDog(Dog dog) {
        state.returnDog(dog);
        setState(new AvailableState());
    }

    public void train(Dog dog) {
        state.train(dog);
        setState(new TrainingState());
    }

    public void quarantine(Dog dog) {
        state.sendToQurantine(dog);
        setState(new QuarantineState());
    }

    public void setState(DogState state) {
        this.state = state;
    }

    public void getDefaultState() {
       System.out.print("Dog is available for adoptation");
    }
}