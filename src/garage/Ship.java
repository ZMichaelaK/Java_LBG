package garage;

public class Ship extends Vehicle {

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
}