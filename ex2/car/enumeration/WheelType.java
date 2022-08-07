package by.part.car.enumeration;

public enum WheelType {
	WINTER("Winter"), SUMMER("Summer");

	private String title;

	WheelType(String title) {
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
