package by.part.car.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import by.part.car.enumeration.CarModel;
import by.part.car.impl.Drive;
import by.part.car.impl.Refuel;

public class Car implements Drive, Refuel {

	private CarModel model;
	private List<Wheel> wheel;
	private Engine engine;
	private Wheel spareWheel;
	private int maxSpeed;
	private boolean drive;
	private double fuel;
	private boolean refuel;

	public Car() {
		this.wheel = new ArrayList<>();
	}

	public Car(CarModel model, List<Wheel> wheel, Engine engine, int maxSpeed) {
		this.model = model;
		this.wheel = wheel;
		this.engine = engine;
		this.maxSpeed = maxSpeed;
	}

	public CarModel getModel() {
		return model;
	}

	public void setModel(CarModel model) {
		this.model = model;
	}

	public List<Wheel> getWheel() {
		return wheel;
	}

	public void setWheel(List<Wheel> wheel) {
		this.wheel = wheel;
	}

	public Wheel getSpareWheel() {
		return spareWheel;
	}

	public void setSpareWheel(Wheel spareWheel) {
		this.spareWheel = spareWheel;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public void go() { // использую методы вызова полей класса, а не прямой доступ к полям класса, что
						// бы при наследовании и переопределении методов не пришлось переопределять и
						// метод завести машину.
		if (isRefuel() && getWheel().size() == 4 && getEngine() != null) { // проверяем наличие топлива, колес,
																			// двигателя
			this.drive = true;
		}

	}

	@Override
	public void stop() {
		this.drive = false;
	}

	@Override
	public boolean isDrive() {
		return drive;
	}

	@Override
	public void setFuel(double fuel) {
		this.fuel = fuel;
		setRefuel();// после заправки устанавливаем датчик топлива. Топливо есть либо нету
	}

	@Override
	public double getFuel() {
		return fuel;
	}

	@Override
	public boolean isRefuel() {
		return refuel;
	}

	@Override
	public void setRefuel() {

		if (getFuel() < 5) { // проверяем наличие топлива, если топливо закончилось - машина остановилась
			this.refuel = false;
			stop();

		} else {
			this.refuel = true;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(engine, maxSpeed, model, wheel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		return Objects.equals(engine, other.engine) && maxSpeed == other.maxSpeed && model == other.model
				&& Objects.equals(wheel, other.wheel);
	}

	@Override
	public String toString() {
		return "Car [model = " + model + ", wheel = " + wheel + ", wheelSpare = " + spareWheel + ", engine = " + engine
				+ ", maxSpeed = " + maxSpeed + ", drive = " + drive + ", fuel = " + fuel + "]";
	}

}
