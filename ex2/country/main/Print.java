package by.part.country.main;

import java.util.Set;

import by.part.country.bean.CapitalState;
import by.part.country.bean.City;
import by.part.country.bean.Country;
import by.part.country.bean.Region;
import by.part.country.bean.RegionalCenter;

public final class Print {

	private Print() {

	}
	
	public static void printString(String str) {
		System.out.printf("%s \n" , str);
	}
	
	public static void printNumberRegion(int numberRegion) {
		System.out.println("Number of region = " + numberRegion);
	}
	
	public static void printArea(double area, String str) {
		System.out.printf("%s = %.2f km2 \n", str,area);
	}
	
	public static void printAllRegionalCenter(Set<City> listCity ) {
		
		System.out.print("Regional center: ");
		listCity.forEach(city -> System.out.printf("%s, ",city.getTitle()));
	}

	public static void printCity(City city) {

		System.out.println("City name - " + city.getTitle());
		System.out.println("City size = " + city.getArea() + " km2");
		System.out.println("City population = " + city.getPopulation() + " people");

		if (city instanceof RegionalCenter) {
			RegionalCenter regionalCenter = (RegionalCenter) city;
			System.out.println("City executive committee - " + regionalCenter.getRegionalExecutiveCommittee());
		}

		if (city instanceof CapitalState) {
			CapitalState capitalState = (CapitalState) city;
			System.out.println("Government house - " + capitalState.getGovernmentHouse());
		}

		System.out.println("----------------------------");
	}

	public static void printRegion(Region region) {

		System.out.println("Region name - " + region.getTitle());

		region.getListCity().forEach(city -> printCity(city));

		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	}

	public static void printCountry(Country country) {

		System.out.println("Country name - " + country.getTitle());
		
		country.getListRegion().forEach(region -> printRegion(region));

	}

}
