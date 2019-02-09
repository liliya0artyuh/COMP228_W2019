package aaa;

public class Animal {
	private String color;
	private String eyes;
	private String type;

	public Animal() {
		super();
	}

	
	
	public Animal(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEyes() {
		return eyes;
	}

	public void setEyes(String eyes) {
		this.eyes = eyes;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "color=" + color + ", eyes=" + eyes + ", type=" + type;
	}

	
	
}