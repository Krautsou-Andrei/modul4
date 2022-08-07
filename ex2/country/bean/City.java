package by.part.country.bean;

import java.util.Objects;

import by.part.country.enumeration.TitleCity;

public class City {

	private static int counter = 0;

	private int ID;
	private TitleCity title;
	private double area;
	private int population;

	public City() {
		this.ID = counter++;

	}

	public City(TitleCity title, double area, int population) {
		this.ID = counter++;
		this.title = title;
		this.area = area;
		this.population = population;
	}

	public int getID() {
		return ID;
	}

	public TitleCity getTitle() {
		return title;
	}

	public void setTitle(TitleCity title) {
		this.title = title;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, title, area, population);
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
		City other = (City) obj;
		return ID == other.ID && title == other.title && area == other.area && population == other.population;
	}

	@Override
	public String toString() {
		return "City [ID = " + ID + ", title = " + title + ", area = " + area + ", population = " + population + "]";
	}
}
