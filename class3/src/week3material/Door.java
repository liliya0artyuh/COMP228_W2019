package week3material;

public class Door {
	public static final String COMPANY = "DoorMaker";
	
	public static boolean isSecure;
	
	private static int numOfLocks;
	private String color;
	private String material;
	
	public Door(String material, String color) {
		super();
		this.color = color;
		this.material = material;
	}

	public Door() {
		
	}

	
	public static int getNumOfLocks() {
		return numOfLocks;
	}

	public static void setNumOfLocks(int numOfLocks) {
		Door.numOfLocks = numOfLocks;
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return "Door [color=" + color + ", material=" + material + "]" + Door.numOfLocks + "isSecure: " + isSecure;
	}


	
}
