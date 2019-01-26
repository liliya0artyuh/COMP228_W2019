package classes;

import classes.house.items.Table;

public class House {
	Door door;
	Table table;
	private int numOfKeys;
	private String color;
	
	public House() {
		super();
		door = new Door("wood", "brown");
		//door = new Door();
		table = new Table();
	}
	
	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public int getNumOfKeys() {
		return numOfKeys;
	}

	public void setNumOfKeys(int numOfKeys) {
		this.numOfKeys = numOfKeys;
	}
	


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
}
