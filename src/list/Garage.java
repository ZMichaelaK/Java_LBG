package list;

import java.util.ArrayList;

import garage.Vehicle;

public class Garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.list();
		}
	}

}
