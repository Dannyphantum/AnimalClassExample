// All Cows are Animals, but not all Animals are Cows.
public class Cow extends Animal {

	public Cow() {
		
		animalType = "cow";
		animalAction = "moo.";
		//System.out.println("Now, I am a cow!");
	}
	
//@Override
	public String eat(){
		return "A cow eats...";
}

//@Override
	public String sleep(){
		return "A cow sleeps...";
}

public String drink(){
	return "I drink water.";
}


}
