
/*
 * This is the parent class. Also called the super class
 */
public class Animal {
	
	public String animalType;
	
	public String animalAction;
	
	public String commonName;
	
	public String breathes() {
		return "An animal breathes";
	}
	
	public String animalBreathing() {
		return "A " + commonName + " breathes";
	}
	
	public String sleep() {
		return "An animal sleeps...";
	}
	public String eat() {
		return "An animal eats...";
	}
	
	public String whatAmI(){
		return "I am a " + animalType;
	}

	public String whatIdo(){
		return "I like to " + animalAction;
	}
	
}

