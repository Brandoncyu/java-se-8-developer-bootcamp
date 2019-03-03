
public class Car {
	String color = "Green";
	String type;
	
	{
		color = "Red";
	}
	
	Car(){
		color = "Blue";
	}
	
	void start() {
		System.out.println("Get Started!");
	}
	
	void printDescription() {
		System.out.println("This is a " + color + " " + type);
	}
}
