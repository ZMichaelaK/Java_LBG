package garage;

public class App {
	public static void main(String[] args) {
		Plane aircrafty = new Plane("Flugh", 8, "white", true);
		aircrafty.setFlying(true);

		Ship shippy = new Ship("Max", 12, "white", true);
		shippy.setFloating(true);

		Car drivy = new Car("Ford 293", 4, "blue", true);
		drivy.setDriving(true);

		aircrafty.list();
		shippy.list();
		drivy.list();
	}
}