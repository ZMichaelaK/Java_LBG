package garage;

import java.util.Objects;

public class Plane extends Vehicle {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(flying);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		return flying == other.flying;
	}

	private boolean flying;

	public Plane() {
	}

	public Plane(String model, int doors, String colour, boolean flying) {
		super(model, doors, colour);
		this.flying = flying;
	}

	public boolean isFlying() {
		return flying;
	}

	public void setFlying(boolean flying) {
		this.flying = flying;
	}

	public Plane(String model, int doors, String colour) {
		super(model, doors, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void list() {
		super.list();
		System.out.println("Flying:" + (isFlying() ? "Yes" : "No"));
		System.out.println("___Plane info: completed___");
	}

	@Override
	public String toString() {
		return "Plane [flying=" + flying + ", getModel()=" + getModel() + ", getDoors()=" + getDoors()
				+ ", getColour()=" + getColour() + "]";
	}
}