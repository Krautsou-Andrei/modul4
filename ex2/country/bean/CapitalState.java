package by.part.country.bean;

import java.util.Objects;

import by.part.country.enumeration.TitleCity;

public class CapitalState extends RegionalCenter {

	private String governmentHouse;

	public CapitalState() {

	}

	public CapitalState(TitleCity title, double area, int population, String regionalExecutiveCommittee,
			String governmentHouse) {
		super(title, area, population, regionalExecutiveCommittee);
		this.governmentHouse = governmentHouse;
	}

	public String getGovernmentHouse() {
		return governmentHouse;
	}

	public void setGonernmentHouse(String governmentHouse) {
		this.governmentHouse = governmentHouse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		return prime * result + Objects.hash(governmentHouse);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CapitalState other = (CapitalState) obj;
		return Objects.equals(governmentHouse, other.governmentHouse);
	}

	@Override
	public String toString() {
		return "Capital state = [" + super.toString() + ", governmentHouse = " + governmentHouse + "]";
	}
}
