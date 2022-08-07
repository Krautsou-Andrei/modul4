package by.part.country.enumeration;

public enum TitleRegion {

	GOMEL("Gomelskaya oblast"), MOGILEV("Mogilevskaya oblast"), MINSK("Minskaya oblast");

	private String title;

	TitleRegion(String title) {
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
