package list;

import garage.Car;
import garage.Plane;
import garage.Ship;

public class App {
	public static void main(String[] args) {
		Garage myGarage = new Garage();
		myGarage.addVehicle(new Car("Ford", 1, "Yellow"));
		myGarage.addVehicle(new Car("Weisc", 10, "White"));
		myGarage.addVehicle(new Car("Cloop", 10, "red"));
		myGarage.removeVehicle(new Car("Ford", 1, "Yellow"));
		myGarage.print();

		Car meep = new Car("bloop", 10, "red", false);
		Car meep2 = new Car("bloop", 10, "red", false);
		Plane plane2 = new Plane("Plane Hill", 10, "black", true);
		Ship ship2 = new Ship("Shiptain", 10, "black", true);

//		System.out.println("meep == meep2:" + (meep.equals(meep2)));

		System.out.println(meep);
		System.out.println(plane2);
		System.out.println(ship2);
		System.out.println(myGarage);
		myGarage.fix();
	}
}