package by.part.car.main;

import by.part.car.bean.Car;

public final class Print {

	private Print() {

	}
	
	public static void printService(boolean changeWheel) {
		
		if (changeWheel) {
			System.out.println("\n" +"Wheel change");
		} else {
			System.out.println("\n"+"Spare wheel not found");
		}
		
		
	}

	public static void printCar(Car car) {

		System.out.print("\n" + car.getModel() + "\n" + "Wheels = ");
		car.getWheel().forEach(System.out::print);
		System.out.println(" Wheel spare = " + car.getSpareWheel());
		System.out.println(car.getEngine() + "\n" + "MaxSpeed = " + car.getMaxSpeed());
		System.out.println("Fuel left = " + car.getFuel());

		if (car.isDrive()) {
			System.out.println("Car go");
		} else {
			System.out.println("Car stop");
		}

		if (!car.isRefuel()) {
			System.out.println("Go to the gas station");
		}
	}

}
