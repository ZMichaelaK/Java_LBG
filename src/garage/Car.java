package garage;

public class Car extends Vehicle {

	private boolean driving;

	public Car() {
	}

	public Car(String model, int doors, String colour, boolean driving) {
		setModel(model);
		setDoors(doors);
		setColour(colour);
		this.driving = driving;
	}

	public boolean isDriving() {
		return driving;
	}

	public void setDriving(boolean driving) {
		this.driving = driving;
	}
}