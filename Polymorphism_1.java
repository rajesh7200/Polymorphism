package Polymorphism;

class Fruit{
	void food()
	{
		System.out.println("Fruit");
	}
}

class Apple extends Fruit{
	void apple1()
	{
		System.out.println("APPLE");
	}
}

public class Polymorphism_1 {

	public static void main(String[] args) {
		food();
		apple1();

	}

}
