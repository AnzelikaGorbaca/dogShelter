package com.anzelika.oodp.decorator;


public class VaccinatedDecorator extends DogDecorator {

    public static final String VACCINATED = "\n   * Vaccinated";

    public VaccinatedDecorator(CustomInformation customInformation) {
        super(customInformation);
    }
    @Override
    public String add() {
        return customInformation.add() + addVaccinated();
    }

    private String addVaccinated() {
        return VACCINATED;
    }

}
