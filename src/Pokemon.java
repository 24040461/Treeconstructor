
public class Pokemon {
	
	String name;
	int level;
	
	void attack() {
		System.out.print(name + " attack!");
	}
	int levelGain() {
		return 20 + 10;
	}
	
	void train() {
		level += levelGain();
		System.out.println("After training you leveled up " + level);
	}
}
