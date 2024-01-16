package garage;

public class Ship extends Vehicle {

	private boolean floating;

	public Ship() {
	}

	public Ship(String model, int doors, String colour, boolean floating) {
		setModel(model);
		setDoors(doors);
		setColour(colour);
		this.floating = floating;
	}

	public boolean isFloating() {
		return floating;
	}

	public void setFloating(boolean floating) {
		this.floating = floating;
	}
}