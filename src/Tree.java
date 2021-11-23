
public class Tree {
	
	String name;
	private int height = 50;
	private int age = 134;
	private String leaves = "Alot";
	
	public void displayInformation() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(leaves);
	}
	
	public void summer() {
		leaves = "ALOT ALOT";
		System.out.println("The tree is in summer " + leaves);
	}
	public void winter() {
		leaves = "Very Low";
		System.out.println("The tree has entered winter the amount of leaves are " + leaves);
	}
	public void age() {
		age++;
		height++;
		System.out.println("The tree is now one year older " + age + " Height is now "+ height);
	}
	public void water() {
		height++;
		leaves = "Alot";
		System.out.println("The tree just got watered " + height + " Amount of leaves "+ leaves);
	}
}
