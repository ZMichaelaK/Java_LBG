package garage;

public class Car extends Vehicle {

	private boolean driving;

	public Car() {
	}

	public Car(String model, int doors, String colour, boolean driving) {
		super(model, doors, colour);
		this.driving = driving;
	}

	public boolean isDriving() {
		return driving;
	}

	public void setDriving(boolean driving) {
		this.driving = driving;
	}

	public Car(String model, int doors, String colour) {
		super(model, doors, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void list() {
		super.list();
		System.out.println("Driving:" + (isDriving() ? "Yes" : "No"));
		System.out.println("___Car info: completed___");
	}
}