
public class Animal {
	private String name = "Lion";
	private int biteStr = 99;
	private int age = 4;
	private String jump = "High";
	
	public void displayInformation() {
		System.out.println(name);
		System.out.println(biteStr);
		System.out.println(age);
		System.out.println(jump);
	}
	
	public void increaseAge() {
		age++;
		System.out.println("The animal had its birthday " + age);
	}
	public void train() {
		biteStr++;
		jump = "Very High";
		System.out.println("The animal trained bite strength is now " + biteStr + " "+jump);
	}
	public void sleep() {
		biteStr--;
		jump = "Low";
		System.out.println("The animal slept bite strength is now " + biteStr + " "+jump);
	}
	public void eat() {
		biteStr++;
		jump = "Average";
		System.out.println("The animal just had a kill " + biteStr + " "+jump);
	}
}




