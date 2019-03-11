
public class Car {
	String color = "Green";
	String type;
	int serialNumber; 
	static int carCount; //static variable. Static is declared to 
	//the left of the type - "int is type.
	
	//initialization block - for complex code.
	{
		color = "Red";
		type = "Celica";
	} 
	
	// desc = This is a blue convertible Celica
	String getDescription()
	{
		String desc = "This is a " + color + " " + type;
		return desc;
	}
	
	// Customize Frame: newColor = blue newType = convertible
	void customize(String color, String type)
	{
		this.color = color;
		this.type = type + " " + this.type;
		System.out.println(getDescription());
	}
	
	//static initialization block - only executed ONCE. 
	//Can only access static variables and static methods.
	//therefore, color = "Black" wont work in this scope.
	//you can repeat static initialization blocks.
	static {
		carCount = 3;
		setCarCount(3);
	}
	public static void setCarCount(int c) {
		carCount = c;
	}
	
	

	Car(){
		carCount++;
		serialNumber = carCount;
		//looks for the constructor with two parameters.
		//this("green", convertible");
	}
	//carCount++ will increment carCount every time you
	//create a new car object. 
	Car(String color, String type){
		//looks for the parameter with no constructor.
		//when you chain constructors, it HAS to be the first line.
		this();
		this.color = color;
		this.type = type;
	}
	
	Car(String color){
		
	}
	
	//color goes from "Green" to "Red" to "Blue"
	
	void start() {
		System.out.println("Get Started!");
	}
	
	void printDescription() {
		System.out.println("This is a " + color + " " + type);
	}
	
	//static method
	static void resetCarCount() {
		carCount = 0;
	}
}
