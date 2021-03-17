package test.generics;
/**
 * Analisadas as da versão Java 11
 */
public class VarianceDoc  {
	
	@SuppressWarnings("rawtypes")
	// ArrayList<? extends Collection> a = new ArrayList<ArrayList> ();
	// ArrayList<? extends List> b = new ArrayList<Collection> (); // falso
	
	public class Animal {}

	public class Cat extends Animal {}

	public class Dog extends Animal {}

	public static void main(String[] args) {

		Cat[] cats = new Cat[2];
		
		Dog[] dogs = new Dog[2];
		 Animal[] animals = cats;
//		Animal[] animals = dogs;
		animals[0] = new Cat();
//		System.out.println(animals);
		animals[0] = new Dog();
		
		// ArrayList<Object> objects = new ArrayList<>(2, String.class);
//		List[] objects = new ArrayList[2];
	}

}
