package by.part.car.enumeration;

public enum CarModel {

	MAZDA("Mazda"), RENAULT("Renault"), GELLY("Gelly"), LADA("Lada");

	private String title;

	CarModel(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title;
	}

}
