package garage;

public class App {
	public static void main(String[] args) {
		Plane aircrafty = new Plane("Flugh", 8, "white", true);
		Ship shippy = new Ship("Max", 12, "white", true);
		Car drivy = new Car("Ford 293", 4, "blue", true);

		aircrafty.list();
		shippy.list();
		drivy.list();

		Plane plane1 = new Plane("McPlane", 20, "red", false);
		Ship ship2 = new Ship("Shipspeare", 8, "green", true);
		Vehicle[] vehicles = { ship2, plane1, new Car("Carthello", 4, "purple", true) };

		for (Vehicle vehicle : vehicles) {
			vehicle.list();
		}
	}
}