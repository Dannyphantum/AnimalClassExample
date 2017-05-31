
public class AnimalApp {

	public static void main(String[] args) {

		/*Animal a = new Animal();
		System.out.println(a.eat());
		
		print(a.eat());
		print(a.sleep());*/

		Cat c = new Cat();
		print(c.whatAmI());
		print(c.whatIdo());

		
		Bird b = new Bird();
		print(b.whatAmI());
		print(b.whatIdo());
		
		Cow d = new Cow();
		print(d.whatAmI());
		print(d.whatIdo());	
		print(d.drink());
	}
	private static void print(String s){
		System.out.println(s);
	}
}
