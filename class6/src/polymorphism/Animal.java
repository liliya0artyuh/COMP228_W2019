package polymorphism;


public class Animal {
	protected String eyes;
	protected String type;
	private String color;


	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	public void eat(){
		System.out.println("Animal is eating.");
	}
	
	public void move(){
		System.out.println("I am moving.");
	}
	
	public void sleep(){
		System.out.println(type + " is sleeping.");
	}
	
	
	@Override
	public String toString() {
		return "eyes=" + eyes + ", type=" + type + ", color=" + color;
	}
}
