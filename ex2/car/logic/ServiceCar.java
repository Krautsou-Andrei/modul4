package by.part.car.logic;

import by.part.car.bean.Car;
import by.part.car.bean.Wheel;

public class ServiceCar {

	public ServiceCar() {

	}

	public boolean changeWheel(Car car, int numberBadWheel) {

		Wheel wheelSpare = car.getSpareWheel();

		if (wheelSpare != null) {

			Wheel temp = car.getWheel().get(numberBadWheel);
			car.getWheel().set(numberBadWheel, wheelSpare);
			car.setSpareWheel(temp);

			return true;
		}

		return false;

	}
}
