package classes;

public class Door {
	private String color;
	private String material;
	
	public Door(String material, String color) {
		super();
		this.color = color;
		this.material = material;
	}

	public Door() {
		
	}

	public String getColor() {
		return color;
	}

	public String getMaterial() {
		return material;
	}

	
	public String getInformation() {
		
		return String.format("color: %s, material: %s", color, material);
	}
	
	
}
