package by.part.country.main;

import java.util.HashSet;
import java.util.Set;

import by.part.country.bean.CapitalState;
import by.part.country.bean.City;
import by.part.country.bean.Country;
import by.part.country.bean.Region;
import by.part.country.bean.RegionalCenter;
import by.part.country.enumeration.TitleCity;
import by.part.country.enumeration.TitleRegion;
import by.part.country.logic.CountryLogic;

public class Main {

	public static void main(String[] args) {

		City loev = new City(TitleCity.LOEV, 240, 20000);
		City Retchitsa = new City(TitleCity.RETCHITSA, 350, 45000);
		City Gomel = new RegionalCenter(TitleCity.GOMEL, 1000, 500000, "GomelExecutiveCommittee");
		City Mozur = new City(TitleCity.MOZUR, 700, 150000);

		City Mogilev = new RegionalCenter(TitleCity.MOGILEV, 850, 350000, "MogilevExecutiveCommittee");
		City Buhov = new City(TitleCity.BUHOV, 300, 30000);
		City Osipovichi = new City(TitleCity.OSIPOVICHI, 400, 50000);

		City Minsk = new CapitalState(TitleCity.MINSK, 5000, 2000000, "MinskExecutiveCommittee", "White house");
		City Slutsk = new City(TitleCity.SLUTSK, 250, 50000);
		City Fanipol = new City(TitleCity.FANIPOL, 500, 100000);
		City Molodechno = new City(TitleCity.MOLODECHNO, 600, 120000);

		Set<City> listGomel = new HashSet<>();
		Set<City> listMogilev = new HashSet<>();
		Set<City> listMinsk = new HashSet<>();

		listGomel.add(loev);
		listGomel.add(loev);
		listGomel.add(Retchitsa);
		listGomel.add(Gomel);
		listGomel.add(Mozur);

		listMogilev.add(Mogilev);
		listMogilev.add(Buhov);
		listMogilev.add(Osipovichi);

		listMinsk.add(Minsk);
		listMinsk.add(Fanipol);
		listMinsk.add(Molodechno);
		listMinsk.add(Slutsk);

		Region regionGomel = new Region(TitleRegion.GOMEL, listGomel);
		Region regionMogilev = new Region(TitleRegion.MOGILEV, listMogilev);
		Region regionMinsk = new Region(TitleRegion.MINSK, listMinsk);

		Set<Region> listRegion = new HashSet<>();

		listRegion.add(regionGomel);
		listRegion.add(regionMogilev);
		listRegion.add(regionMinsk);

		Country belarus = new Country("Belarus", listRegion);
		CountryLogic countryLogic = new CountryLogic();

		// Print.printCountry(belarus);
		Print.printString("Country - " + belarus.getTitle());
		Print.printString("Capital state ");
		Print.printCity(countryLogic.searchCapitalState(belarus.getListRegion()));
		Print.printNumberRegion(countryLogic.numberRegion(belarus.getListRegion()));
		Print.printArea(countryLogic.countryArea(belarus.getListRegion()), "Country area = ");
		Print.printAllRegionalCenter(countryLogic.listRegionalCenter(belarus.getListRegion()));

	}

}
