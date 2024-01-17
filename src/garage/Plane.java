package garage;

public class Plane extends Vehicle {

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
}