package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import garage.Car;
import garage.Plane;
import garage.Ship;
import garage.Vehicle;

public class App {
	public static void main(String[] args) {
		Garage myGarage = new Garage();
		myGarage.addVehicle(new Car("Ford", 1, "Yellow"));
		myGarage.addVehicle(new Car("Weisc", 10, "White"));
		myGarage.addVehicle(new Car("Cloop", 10, "red"));
		myGarage.removeVehicle(1);
		myGarage.print();

		Car meep = new Car("bloop", 10, "red", false);
//		Car meep2 = new Car("bloop", 10, "red", false);
		Plane plane2 = new Plane("Plane Hill", 10, "black", true);
		Ship ship2 = new Ship("Shiptain", 10, "black", true);

//		System.out.println("meep == meep2:" + (meep.equals(meep2)));

		System.out.println(meep);
		System.out.println(plane2);
		System.out.println(ship2);
		System.out.println(myGarage);
		myGarage.fix();

		List<Flyable> flying = new ArrayList<>();
		flying.add(new Bird());
		flying.add(new Plane());
		for (Flyable f : flying) {
			f.fly();
		}
		{
			List<Integer> nums = new ArrayList<>();

			nums.add(5);
			nums.add(12);
			nums.add(1);
			nums.add(50);
			nums.add(25);
			Collections.sort(nums);
			System.out.println("Sorted nums: " + nums);

			List<Vehicle> vehicles = new ArrayList<>();

			Vehicle car1 = new Car("Volvo", 3, "Black");
			Vehicle car2 = new Car("Land Rover", 4, "white");
			Vehicle car3 = new Car("Fiat", 6, "orange");
			Vehicle car4 = new Car("Alpha Romeo", 6, "bloo");

			vehicles.add(car3);
			vehicles.add(car2);
			vehicles.add(car1);
			vehicles.add(car4);

			Collections.sort(vehicles);

			System.out.println("Sorted vehicles: " + vehicles);
		}
	}
}