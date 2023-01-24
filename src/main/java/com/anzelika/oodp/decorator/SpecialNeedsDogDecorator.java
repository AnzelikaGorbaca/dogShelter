package com.anzelika.oodp.decorator;


public class SpecialNeedsDogDecorator extends DogDecorator {
    public static final String SPECIAL_NEEDS = "\n   * Dog with special needs";

    public SpecialNeedsDogDecorator(CustomInformation customInformation) {
        super(customInformation);
    }

    @Override
    public String add() {
        return customInformation.add() + addSpecialNeeds();
    }

    private String addSpecialNeeds() {
        return SPECIAL_NEEDS;
    }
}

