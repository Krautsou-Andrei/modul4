package by.part.country.bean;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import by.part.country.enumeration.TitleRegion;
import by.part.country.impl.AddAndRemoveCity;

public class Region implements AddAndRemoveCity {

	private static int counter = 0;

	private int ID;
	private TitleRegion title;
	private Set<City> listCity = new HashSet<>();

	public Region() {
		this.ID = counter++;
	}

	public Region(TitleRegion title, Set<City> listCity) {
		this.ID = counter++;
		this.title = title;
		this.listCity = listCity;
	}

	public int getID() {
		return ID;
	}

	public TitleRegion getTitle() {
		return title;
	}

	public void setTitle(TitleRegion title) {
		this.title = title;
	}

	public Set<City> getListCity() {
		return listCity;
	}

	public void setListCity(Set<City> listCity) {
		this.listCity = listCity;
	}

	@Override
	public void addCity(City city) {
		this.listCity.add(city);
	}

	@Override
	public void removeCity(City city) {
		this.listCity.remove(city);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, title, listCity);
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
		Region other = (Region) obj;
		return ID == other.ID && title == other.title && Objects.equals(listCity, other.listCity);
	}

	@Override
	public String toString() {
		return "Region = [ID = " + ID + ", title = " + title + ", listCity = " + listCity + "]";
	}

}
