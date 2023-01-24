package com.anzelika.oodp;


import com.anzelika.oodp.bridge.*;
import com.anzelika.oodp.builder.Dog;
import com.anzelika.oodp.builder.DogBuilder;
import com.anzelika.oodp.builder.Gender;
import com.anzelika.oodp.decorator.*;
import com.anzelika.oodp.state.AdoptedState;
import com.anzelika.oodp.state.AvailableState;
import com.anzelika.oodp.state.DogStateController;
import com.anzelika.oodp.strategy.AdoptionStrategy;
import com.anzelika.oodp.strategy.FirstComeFirstServe;
import com.anzelika.oodp.strategy.Interview;
import com.anzelika.oodp.strategy.Lottery;

import java.util.*;

import static java.lang.System.out;

public class OodpApplication {
	public static void main(String[] args) {

		DogShelterAbstraction kepuKepaShelter = new KepuKepaShelter("Kepu Kepa", "Kepu iela 4-55, Riga, LV-1053", 0, 0, new ArrayList<>(), new PuppiesType());
		DogShelterAbstraction laimigasAstesShelter = new LaimigasAstesShelter("Laimigas Astes", "Laimiga iela 88-5, Rezekne, LV-1023", 100, 0, new ArrayList<>(), new SpecialNeedsType());
		DogShelterAbstraction ulubeleShelter = new UlubeleShelter("Ulubele", "Ulubeles iela 7, Riga, LV-1001", 120, 0, new ArrayList<>(), new AllDogsType());

		Random random = new Random();
		List <DogShelterAbstraction> shelters = Arrays.asList(kepuKepaShelter, laimigasAstesShelter, ulubeleShelter);
		List<String> dogBreeds = Arrays.asList("Golden Retriever", "Labrador Retriever", "German Shepherd", "Bulldog", "Poodle", "Unknown");
		List<String> dogColors = Arrays.asList("Brown", "Black", "White", "Yellow", "Golden");
		List <String> dogStatus = Arrays.asList("Returned", "Adopted", "Quarantine", "Training", "Available");
		List<String> dogName = Arrays.asList("Rex", "Vegas", "Anna", "Puisis", "Suns", "Kepa", "Pinks", "Duksis", "Aste", "No Name", "Madrid", "Meitene", "Zakis", "Skaistulis", "Max");
		List<AdoptionStrategy> strategies = Arrays.asList(new FirstComeFirstServe(), new Interview(), new Lottery());

		int numberOfDogs = random.nextInt(16 - 5) + 5;

		for(int i = 0; i < numberOfDogs; i++) {
			String randomBreed = dogBreeds.get(random.nextInt(dogBreeds.size()));
			String randomColor = dogColors.get(random.nextInt(dogColors.size()));
			String randomName = dogName.get(random.nextInt(dogName.size()));
			DogShelterAbstraction randomDogShelter = shelters.get (random.nextInt(shelters.size()));

			int randomAge = random.nextInt(10) + 1;
			Gender randomGender = random.nextInt(2) == 0 ? Gender.FEMALE : Gender.MALE;

			DogBuilder builder = new DogBuilder();
			Dog dog = builder.setBreed(randomBreed)
					.setColor(randomColor)
					.setAge(randomAge)
					.setGender(randomGender)
					.setName(randomName)
					.createDog();

			randomDogShelter.addDog(dog);
		}

		for(DogShelterAbstraction dogShelter: shelters) {
			printAllInfo(dogShelter, dogStatus, strategies);
		}
	}

	public static void printDogStateInfo(Dog dog, String randomStatus, DogStateController dogStateController) {
				out.print("Current Dog State: ");

				if("Adopted".equals(randomStatus)) {
					dogStateController.adopt(dog);
				} else if("Returned".equals(randomStatus)) {
					dogStateController.setState(new AdoptedState());
					dogStateController.returnDog(dog);
				} else if("Training".equals(randomStatus)) {
					dogStateController.train(dog);
				} else if("Quarantine".equals(randomStatus)) {
					dogStateController.quarantine(dog);
				} else {
					dogStateController.getDefaultState();
				}
				dogStateController.setState(new AvailableState());
		}

	public static CustomInformation addDecoratorInfo(CustomInformation customInformation, Dog dog) {
		if(dog.getAge() > 1) {
			customInformation = new VaccinatedDecorator(customInformation);
		}
		if(dog.getGender().toString().equals("MALE")) {
			customInformation = new TrainedDogDecorator(customInformation);
		}
		if(dog.getBreed().equals("Unknown")) {
			customInformation = new SpecialNeedsDogDecorator(customInformation);
		}
		return customInformation;
	}

	public static void printDogInfo(DogShelterAbstraction dogShelter, List <String> dogStatus) {
		DogStateController dogStateController = new DogStateController();
		out.println ("\n---------------------------------------------------------------------------------------");
		out.print("\nDOGS IN SHELTER " + dogShelter.getName().toUpperCase(Locale.ROOT));

		String randomStatus;

		for(Dog dog : dogShelter.getDogs()) {
			Random random = new Random();
			randomStatus = dogStatus.get(random.nextInt(dogStatus.size()));

			out.println(dog.getDescription());
			printDogStateInfo(dog, randomStatus, dogStateController);

			CustomInformation customInformation = new DefaultInformation();
			customInformation = addDecoratorInfo( customInformation,dog);
			out.println("\nDog Information: " + customInformation.add());

		}
	}

	public static void printShelterInfo(DogShelterAbstraction dogShelter, List<AdoptionStrategy> strategies) {
		Random random = new Random();
		out.println ("\n\n---------------------------------------------------------------------------------------");
		out.println ("\n---------------------------------------------------------------------------------------");
		out.println(dogShelter.displayInformation());
		AdoptionStrategy randomStrategy = strategies.get(random.nextInt(strategies.size()));
		randomStrategy.applyAdoptationStrategy(dogShelter);
	}

	public static void printAllInfo(DogShelterAbstraction dogShelter, List<String> randomStatus,
			List<AdoptionStrategy> strategies){
		printShelterInfo(dogShelter, strategies);
		printDogInfo(dogShelter, randomStatus);
	}

}