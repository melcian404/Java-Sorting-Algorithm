
public class Monkey extends RescueAnimal {
	// Instance variables
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;

	// Constructor
	public Monkey(String name, String tailLength, String height, String bodyLength, String species, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
		setName(name);
		setTailLength(tailLength);
		setHeight(height);
		setBodyLength(bodyLength);
		setSpecies(species);
		setGender(gender);
		setAge(age);
		setWeight(weight);
		setAcquisitionDate(acquisitionDate);
		setAcquisitionLocation(acquisitionCountry);
		setTrainingStatus(trainingStatus);
		setReserved(reserved);
		setInServiceCountry(inServiceCountry);
	}

	// Accessors
	public String getTailLength() {
		return tailLength;
	}

	public String getHeight() {
		return height;
	}

	public String getBodyLength() {
		return bodyLength;
	}

	public String getSpecies() {
		return species;
	}

	// Mutators
	public void setTailLength(String tailLength) {
		this.tailLength = tailLength;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public void setBodyLength(String bodyLength) {
		this.bodyLength = bodyLength;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	@Override
    public String toString() {
        return "Name: " + name + "; Tail Length: " + tailLength + "; Height: " + height + "; Body Length: " + bodyLength + "; Species: " + species + "; Gender: " + gender + "; Age: " + age + "; Weight: " + weight + "; Acquisition Date: " + acquisitionDate + "; Acquisition Country: " + acquisitionCountry + "; Training Status: " + trainingStatus + "; Reserved: " + reserved + "; In-service Country: " + inServiceCountry; 
    }
}