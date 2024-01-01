package Practice_Lessons;

public class ogrenci extends Kisi{
	private int number;
	private int sinif;

	public ogrenci(String firstName, String surName, String tcNumber, int age, int number, int sinif) {
		super(firstName, surName, tcNumber, age);
		this.number = number;
		this.sinif = sinif;
	}

	public ogrenci() {
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSinif() {
		return sinif;
	}

	public void setSinif(int sinif) {
		this.sinif = sinif;
	}

	@Override
	public String toString() {
		return "" + super.toString() +
				"Numarası : " + number + "\n" +
				"Sınıfı : " + sinif;
	}
}
