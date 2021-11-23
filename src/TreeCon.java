

	
	public class TreeCon {
	    String name;
	    int treeHeight;
	    int treeAge;
	    String leaves;
	    
	    
	    public TreeCon(String Name, String Leaves, int Age, int Height) {
	        name = Name;
	        leaves = Leaves;
	        treeAge = Age;
	        treeHeight = Height;
	        // the variable names on line 8 are different to the ones declared from line 3 to 6
	    }
	    
	    public void name() {
	    	System.out.println("THe name of said tree: "+name);
	    }
	   
		public static void main(String[] args) {
	        TreeCon treeOne = new TreeCon("Oak", "Alot", 122, 1000);
	        TreeCon treeTwo = new TreeCon("Pine", "None", 21, 345);
	        System.out.println("Type of tree: " + treeOne.name);
	        System.out.println("Height of tree: "+treeTwo.treeHeight + "cm");
	    }
	}

