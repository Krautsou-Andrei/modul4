package by.part.country.bean;

import java.util.Objects;

import by.part.country.enumeration.TitleCity;

public class RegionalCenter extends City {

	private String regionalExecutiveCommittee;

	public RegionalCenter() {

	}

	public RegionalCenter(TitleCity title, double area, int population, String regionalExecutiveCommittee) {
		super(title, area, population);
		this.regionalExecutiveCommittee = regionalExecutiveCommittee;
	}

	public String getRegionalExecutiveCommittee() {
		return regionalExecutiveCommittee;
	}

	public void setRegionalExecutiveCommittee(String regionalExecutiveCommitte) {
		this.regionalExecutiveCommittee = regionalExecutiveCommitte;
	}

	@Override
	public int hashCode() {
		final int prime = 31; // значение подобрано эмпирическим путем
		int result = super.hashCode();// получаем значение hashCode родительского класса
		return prime * result + Objects.hash(regionalExecutiveCommittee);// вычисляем hashCode данного класса
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		// проверяем равенство полей родительского класса
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RegionalCenter other = (RegionalCenter) obj;
		return Objects.equals(regionalExecutiveCommittee, other.regionalExecutiveCommittee);
	}

	@Override
	public String toString() {
		return super.toString() + ", RegionalExecutiveCommittee = " + regionalExecutiveCommittee;
	}

}
