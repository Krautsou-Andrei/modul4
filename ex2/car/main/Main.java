package by.part.car.main;

import java.util.ArrayList;
import java.util.List;

import by.part.car.bean.Car;
import by.part.car.bean.Engine;
import by.part.car.bean.Wheel;
import by.part.car.enumeration.CarModel;
import by.part.car.enumeration.WheelType;
import by.part.car.logic.ServiceCar;

public class Main {
	public static void main(String[] args) {

		Wheel wheel1 = new Wheel(WheelType.SUMMER, 16);
		Wheel wheel2 = new Wheel(WheelType.SUMMER, 16);
		Wheel wheel3 = new Wheel(WheelType.SUMMER, 16);
		Wheel wheel4 = new Wheel(WheelType.SUMMER, 16);
		Wheel spareWheel = new Wheel(WheelType.WINTER, 16);

		Engine engine = new Engine(150, 2.4);

		List<Wheel> wheel = new ArrayList<>();
		wheel.add(wheel1);
		wheel.add(wheel2);
		wheel.add(wheel3);
		wheel.add(wheel4);
		
		ServiceCar service = new ServiceCar();

		Car car = new Car(CarModel.GELLY, wheel, engine, 210);
		Print.printCar(car);

		car.setSpareWheel(spareWheel);
		car.setFuel(15);
		car.go();
		Print.printCar(car);

		Print.printService(service.changeWheel(car, 1));
		
		car.setFuel(0);
		car.go();
		Print.printCar(car);

		car.setFuel(0);
		Print.printCar(car);

		
	}

}
