package by.part.car.bean;

import java.util.Objects;

import by.part.car.enumeration.WheelType;

public class Wheel {

	private WheelType type;
	private int diametr;

	public Wheel() {

	}

	public Wheel(WheelType type, int diametr) {
		this.type = type;
		this.diametr = diametr;
	}

	public WheelType getType() {
		return type;
	}

	public void setType(WheelType type) {
		this.type = type;
	}

	public int getDiametr() {
		return diametr;
	}

	public void setDiametr(int diametr) {
		this.diametr = diametr;
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, diametr);
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
		Wheel other = (Wheel) obj;
		return type == other.type && diametr == other.diametr;
	}

	@Override
	public String toString() {
		return "(" + type + ", " + diametr + ")";
	}
}
