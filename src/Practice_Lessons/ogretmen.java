package Practice_Lessons;

public class ogretmen extends Kisi{
	private  String bolum;
	private int sicilNo;

	public ogretmen(String firstName, String surName, String tcNumber, int age, String bolum, int sicilNo) {
		super(firstName, surName, tcNumber, age);
		this.bolum = bolum;
		this.sicilNo = sicilNo;
	}

	public ogretmen() {
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public int getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(int sicilNo) {
		this.sicilNo = sicilNo;
	}

	@Override
	public String toString() {
		return "ogretmen{" + super.toString() +
				"bolum='" + bolum + '\'' +
				", sicilNo=" + sicilNo +
				'}';
	}
}
