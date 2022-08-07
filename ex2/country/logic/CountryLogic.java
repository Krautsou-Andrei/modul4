package by.part.country.logic;

import java.util.HashSet;
import java.util.Set;

import by.part.country.bean.CapitalState;
import by.part.country.bean.City;
import by.part.country.bean.Region;
import by.part.country.bean.RegionalCenter;

public class CountryLogic {

	public CountryLogic() {

	}

	public City searchCapitalState(Set<Region> listRegion) {

		City capitalState = new CapitalState();

		for (Region region : listRegion) {
			capitalState = searchRegionalCenter(region.getListCity());

			if (capitalState != null && capitalState instanceof CapitalState) {

				return capitalState;

			}
		}

		return capitalState;
	}

	public int numberRegion(Set<Region> listRegion) {

		return listRegion.size();
	}

	public Set<City> listRegionalCenter(Set<Region> listRegion) {

		Set<City> listRegionalCenter = new HashSet<>();

		for (Region region : listRegion) {
			if (searchRegionalCenter(region.getListCity()) != null) {
				listRegionalCenter.add(searchRegionalCenter(region.getListCity()));
			}
		}
		return listRegionalCenter;
	}

	public City searchRegionalCenter(Set<City> listCity) {

		for (City city : listCity) {
			if (city instanceof RegionalCenter) {
				return city;
			}
		}
		return new RegionalCenter();
	}

	public double countryArea(Set<Region> listRegion) {

		double countryArea = 0;

		for (Region region : listRegion) {
			countryArea += regionArea(region.getListCity());
		}
		return countryArea;
	}

	public double regionArea(Set<City> listCity) {

		double regionArea = 0;// будем считать, что любая площадь области принадлежит какому-либо городу.
								// Значит площадь области равна сумме площадей городов

		for (City city : listCity) {
			regionArea += city.getArea();
		}
		return regionArea;
	}

}
