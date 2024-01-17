package list;

import garage.Car;

public class App {
	public static void main(String[] args) {
		Garage myGarage = new Garage();
		myGarage.addVehicle(new Car("Ford", 1, "Yellow"));
		myGarage.addVehicle(new Car("Weisc", 10, "White"));
		myGarage.addVehicle(new Car("bloop", 10, "red"));
		myGarage.print();
	}
}