import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class Driver {
	// Scan in input
	private static Scanner scanner = new Scanner(System.in);
	
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // Instance variables (if needed)

    // Array list for monkeys
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    
    public static void main(String[] args) {
    	
    	String menuChoice = " ";
        initializeDogList();
        initializeMonkeyList();

     // While loop for menuChoice
        while (!menuChoice.equalsIgnoreCase("q")) {
        	displayMenu();
        	menuChoice = scanner.nextLine();	
        	switch (menuChoice) {
        		case "1":
        			intakeNewDog(scanner);
        			break;
        		case "2":
        			intakeNewMonkey(scanner);
        			break;
        		case "3":
        			reserveAnimal(scanner);
        			break;
        		case "4":
        			printAnimals('4');
        			break;
        		case "5":
        			printAnimals('5');
        			break;
        		case "6":
        			printAnimals('6');
        			break;
        		default:
        			if(!menuChoice.equalsIgnoreCase("q")) {
        				System.out.println("Invalid input");
        			}
        		break;
        	}
        }

    }
        
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Tasha", "15.2", "14.0", "9.8", "tamarin", "female", "4", "12.5", "02-03-2019", "Peru", "intake", false, "United States");
    	Monkey monkey2 = new Monkey("Hendrick","26.3", "48.5", "42.0", "guenon", "male", "1", "6.2", "12-25-2022", "Africa", "intake", true, "United States"); 
    	Monkey monkey3 = new Monkey("Marlene", "8.7", "7.4", "14.0", "marmoset", "female", "2", "9.9", "08-17-2021", "Brazil", "intake", true, "United States");
    	
    	monkeyList.add(monkey1);
    	monkeyList.add(monkey2);
    	monkeyList.add(monkey3);
    }


    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        System.out.println("What is the new dog's breed?");
        String breed = scanner.nextLine();
        System.out.println("What is the new dog's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the new dog's age?");
        String age = scanner.nextLine();
        System.out.println("What is the new dog's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the new dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("What is the new dog's acquisition country?");
        String acquisitonCountry = scanner.nextLine();
        System.out.println("What is the new dog's training status (Phase I, Phase II, Phase III, Phase IV, Phase V, or in-service?");
        String trainingStatus = scanner.nextLine();
    	System.out.println("Is the new dog reserved? True or false?");
        boolean reserved = scanner.nextBoolean();
    	scanner.nextLine();
        System.out.println("What is the new dog's in service country?");
        String inServiceCountry = scanner.nextLine();

    // Create new dog object with attributes and variables
    Dog dog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitonCountry, trainingStatus, reserved, inServiceCountry);

    // Add new dog to list
    dogList.add(dog);
    System.out.println("Dog has been added to system.");
}

    

public static void intakeNewMonkey(Scanner scanner) {
    // Prompt monkey's name
    System.out.println("What is the new monkey's name?");
    String name = scanner.nextLine();

    // Make sure monkey not already in system
    for (Monkey monkey: monkeyList) {
    	if (monkey.getName().equalsIgnoreCase(name)) {
    		System.out.println("\n\nThis monkey is already in our system.\n\n");
    		return; // returns to menu
        }
    }

    // Prompt for monkey inputs
    System.out.println("What is the new monkey's tail length?");
    String tailLength = scanner.nextLine();
    System.out.println("What is the new monkey's height?");
    String height = scanner.nextLine();
    System.out.println("What is the new monkey's body length?");
    String bodyLength = scanner.nextLine();
    System.out.println("What is the new monkey's species?");
    String species = scanner.nextLine();

    // Input validation for species type
    while (!(Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin").contains(species))) {
    	System.out.println("Ineligible monkey species. Eligible monkey species: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin");
    	System.out.println("Enter an eligible monkey species: ");
    	species = scanner.nextLine();
    }      

    // Prompt monkey input
    System.out.println("What is the new monkey's gender?");
    String gender = scanner.nextLine();
    System.out.println("What is the new monkey's age?");
    String age = scanner.nextLine();
    System.out.println("What is the new monkey's weight?");
    String weight = scanner.nextLine();
    System.out.println("What is the new monkey's acquisition date?");
    String acquisitionDate = scanner.nextLine();
    System.out.println("What is the new monkey's acquisition country?");
    String acquisitonCountry = scanner.nextLine();
    System.out.println("What is the new monkey's training status (Phase I, Phase II, Phase III, Phase IV, Phase V, or in-service?");
    String trainingStatus = scanner.nextLine();  
    System.out.println("Is the new dog reserved? True or false?");
    boolean reserved = scanner.nextBoolean();
    scanner.nextLine();
    System.out.println("What is the new monkey's in service country?");
    String inServiceCountry = scanner.nextLine();

    // Create new monkey with attributes and variables
    Monkey monkey = new Monkey(name, tailLength, height, bodyLength, species, gender, age, weight, acquisitionDate, acquisitonCountry, trainingStatus, reserved, inServiceCountry);

    // Add the new monkey to list
    monkeyList.add(monkey);
    System.out.println("Monkey has been added to system.");
} 


// Complete reserveAnimal
public static void reserveAnimal(Scanner scanner) {
    // Prompt user for animal type and in service country
	System.out.println("What is the animal type? Dog or Monkey?");
	String animalType = scanner.nextLine();   	
	System.out.println("What is the animal's in service country?");
    String inServiceCountry = scanner.nextLine();

    // Check for monkey availability and reserve first available
    boolean reservation = false;
    if (animalType.equalsIgnoreCase("Monkey")) {    	
    	for (Monkey monkey: monkeyList) {
    		if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && monkey.getReserved() == false && monkey.getTrainingStatus() == "in service") {
    			monkey.setReserved(true);
    			System.out.println("You have reserved " + monkey.toString());
    			reservation = true;
    			return;
    		}      	
    	}
    	if (reservation == false) {
    		System.out.println("No Monkey is available to reserve at this service location.");
    	}
    }

    // Check for dog availability and reserve first available
    if (animalType.equalsIgnoreCase("Dog")) { 
    	for (Dog dog: dogList) {
    		if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && dog.getReserved() == false && dog.getTrainingStatus() == "in service") {
    			dog.setReserved(true);
    			System.out.println("You have reserved " + dog.toString());
    			reservation = true;
    			return;
    		}     		
    	}
    	if (reservation == false) {
    		System.out.println("No Dog is available to reserve at this service location.");
    	}
    }
    else {
    	System.out.println("Invalid Animal Type. Please reselect from main menu.");
    }
}

// Complete printAnimals
public static void printAnimals(char menuChoice) {
    // Prints dog list
	if (menuChoice == '4') {
    	for (int i = 0; i < dogList.size(); i++) {
    		System.out.println(dogList.get(i).toString());
    	}
    }

	// Prints monkey list
    else if (menuChoice == '5') {
    	for (int i = 0; i < monkeyList.size(); i++) {
    		System.out.println(monkeyList.get(i).toString());
    	}
    }

	// Prints all in service animals
    else if (menuChoice == '6') {
        // Iterates through dog list
        for (int i = 0; i < dogList.size(); i++) {
        	if (dogList.get(i).getTrainingStatus().equals("in service") && dogList.get(i).getReserved()== false) {
                // Prints available in service dogs
                System.out.println(dogList.get(i).toString());
            }

        }
        // Iterates through in service available monkey list
        for (int i = 0; i < monkeyList.size(); i++) {
            if (monkeyList.get(i).getTrainingStatus().equalsIgnoreCase("in service") && monkeyList.get(i).getReserved()== false) {
                // Prints available in service monkeys
                System.out.println(monkeyList.get(i));
            }
        }
    }
}
}