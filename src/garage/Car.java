package garage;

public class Car extends Vehicle {

	@Override
	public String toString() {
		return "Car [driving=" + driving + ", getModel()=" + getModel() + ", getId()=" + getId() + ", getDoors()="
				+ getDoors() + ", getColour()=" + getColour() + "]";
	}

	private boolean driving;

	public Car() {
		super();
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
	}

	@Override
	public void list() {
		super.list();
//		System.out.println("Driving: " + (isDriving() ? "Yes" : "No"));
//		System.out.println("___Car info: completed___");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;

		if (!super.equals(obj)) {
			return false;
		}

		return this.driving == other.isDriving();
	}

}