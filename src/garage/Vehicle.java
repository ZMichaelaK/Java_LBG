package garage;

import java.util.Objects;

public class Vehicle {

	private String model;
	private int doors;
	private String colour;

	public Vehicle() {
	}

	public double calcBill() {
		double service = 10.0;
		double doorFix = 50.0;

		return (service + doors * doorFix);
	}

	public Vehicle(String model, int doors, String colour) {
		this.model = model;
		this.doors = doors;
		this.colour = colour;
	}

	public void list() {
//		System.out.println("Model name: " + this.model);
//		System.out.println("# of doors: " + this.doors);
//		System.out.println("Colour: " + this.colour);
	}

	public String getModel() {
		return model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, doors, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(colour, other.colour) && doors == other.doors && Objects.equals(model, other.model);
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", doors=" + doors + ", colour=" + colour + "]";
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
