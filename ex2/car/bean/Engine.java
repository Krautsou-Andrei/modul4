package by.part.car.bean;

import java.util.Objects;

public class Engine {

	private int power;
	private double engineVolume;

	public Engine() {

	}

	public Engine(int power, double engineVolume) {
		this.power = power;
		this.engineVolume = engineVolume;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	@Override
	public int hashCode() {
		return Objects.hash(power, engineVolume);
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
		Engine other = (Engine) obj;
		return power == other.power && engineVolume == other.engineVolume;
	}

	@Override
	public String toString() {
		return "Engine [ power = " + power + ", engineVolume = " + engineVolume + "]";
	}
}
