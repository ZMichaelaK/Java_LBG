package garage;

public class Plane extends Vehicle {

	private boolean flying;

	public Plane() {
	}

	public Plane(String model, int doors, String colour, boolean flying) {
		setModel(model);
		setDoors(doors);
		setColour(colour);
		this.flying = flying;
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}
}