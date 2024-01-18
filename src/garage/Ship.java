package garage;

import java.util.Objects;

public class Ship extends Vehicle {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(floating);
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
		Ship other = (Ship) obj;
		return floating == other.floating;
	}

	private boolean floating;

	public Ship() {
	}

	public Ship(String model, int doors, String colour, boolean floating) {
		super(model, doors, colour);
		this.floating = floating;
	}

	public boolean isFloating() {
		return floating;
	}

	public void setFloating(boolean floating) {
		this.floating = floating;
	}

	public Ship(String model, int doors, String colour) {
		super(model, doors, colour);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void list() {
		super.list();
		System.out.println("Floating:" + (isFloating() ? "Yes" : "No"));
		System.out.println("___Ship info: completed___");
	}

	@Override
	public String toString() {
		return "Ship [floating=" + floating + ", getModel()=" + getModel() + ", getDoors()=" + getDoors()
				+ ", getColour()=" + getColour() + "]";
	}
}