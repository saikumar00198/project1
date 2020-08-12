package polymorphism;

public class Test {

	public static void main(String[] args) {
		Animal myanimal = new Animal();
		Animal mydog = new Dog();
		Animal mycat = new Cat();
		Animal mypig = new Pig();
		myanimal.Animalsound();
		mycat.Animalsound();
		mydog.Animalsound();
		mypig.Animalsound();

	}

}
