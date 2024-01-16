package garage;

public class Vehicle {

	private String model;
	private int doors;
	private String colour;

	public Vehicle() {
	}

	public Vehicle(String model, int doors, String colour) {
		this.model = model;
		this.doors = doors;
		this.colour = colour;
	}

	public void list() {
		System.out.println("Model name: " + this.model);
		System.out.println("# of doors: " + this.doors);
		System.out.println("Colour: " + this.colour);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
