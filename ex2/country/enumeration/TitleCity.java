package by.part.country.enumeration;

public enum TitleCity {

	GOMEL("Gomel"), LOEV("Loev"), RETCHITSA("Retchitsa"), MOZUR("Mozur"), MOGILEV("Mogilev"), BUHOV("Buhov"),
	OSIPOVICHI("Osipovichi"), MINSK("Minsk"), SLUTSK("Slutsk"), FANIPOL("Fanipol"), MOLODECHNO("Molodechno");

	private String title;

	TitleCity(String title) {
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
