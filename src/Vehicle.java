
public class Vehicle {
	String name = "Herbie";
	private String model = "Beetle";
	private int age = 1;
	
	public void displayInformation() {
		String displayMessage = String.format("The name of the car is %s", name);
		System.out.println(displayMessage);
		System.out.println(model);
		System.out.println("The name of the car is " + name);
	  //System.out.println("The model of the car is {0}", model);
//		%s string display
	}
	
	public void increaseAge() {
		age++;
		System.out.println("The age of the car is" + age);
	}
}

