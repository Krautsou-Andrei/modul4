package by.part.country.bean;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import by.part.country.impl.AddAndRemoveRegion;

public class Country implements AddAndRemoveRegion {

	private static int counter = 0;

	private int ID;
	private String title;
	private Set<Region> listRegion = new HashSet<>();

	public Country() {
		this.ID = counter++;
	}

	public Country(String title, Set<Region> listRegion) {
		this.ID = counter++;
		this.title = title;
		this.listRegion = listRegion;
	}

	public int ID() {
		return ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<Region> getListRegion() {
		return listRegion;
	}

	public void setListRegion(Set<Region> listRegion) {
		this.listRegion = listRegion;
	}

	@Override
	public void addRegion(Region region) {
		this.listRegion.add(region);
	}

	@Override
	public void removeRegion(Region region) {
		this.listRegion.remove(region);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, listRegion);
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
		Country other = (Country) obj;
		return ID == other.ID && Objects.equals(title, other.title) && Objects.equals(listRegion, other.listRegion);
	}

	@Override
	public String toString() {
		return "Country = [ID = " + ID + ", title = " + title + "List region = " + listRegion + "]";
	}

}
