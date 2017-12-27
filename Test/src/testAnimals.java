
public class testAnimals {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.sound();
		a= new Dog();
		a.sound();
		a= new Cat();
		a.sound();
		a=new Puppy();
		a.sound();
		
//		Dog b = new Animal();
		
		if( a instanceof Dog){
			System.out.println(" Dog instance in Animal");
		}
		if( a instanceof Cat){
			System.out.println(" Cat instance in Animal");
		}
		if( a instanceof Puppy){
			System.out.println(" Puppy of Dog instance in Animal");
		}
		

	}

}
