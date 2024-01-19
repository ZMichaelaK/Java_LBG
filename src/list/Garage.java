package list;

import java.util.ArrayList;

import garage.Vehicle;

public class Garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}
	public void removeVehicle(int id) {
		for (Vehicle vehicle : this.vehicles) {
			if (id == vehicle.getId()) {
				this.vehicles.remove(vehicle);
				return;
			}
		}
	}

	public void print() {
		for (Vehicle vehicle : vehicles)
			vehicle.list();
	}

	public void fix() {
		double calcBill = 0.0;
		for (Vehicle vehicle : vehicles) {
			calcBill += vehicle.calcBill();
		}
		System.out.println(calcBill);
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}
}