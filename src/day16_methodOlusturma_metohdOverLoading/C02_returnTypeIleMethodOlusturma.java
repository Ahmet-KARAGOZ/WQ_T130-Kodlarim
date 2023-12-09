package day16_methodOlusturma_metohdOverLoading;

public class C02_returnTypeIleMethodOlusturma {
	public static void main(String[] args) {

		/*
		A**** B**** formatında bize döndürsün
		 */

		System.out.println(ismiIstenenFormataCevir("mustafa","topaloglu"));
	}
	public static String ismiIstenenFormataCevir(String isim ,String soyisim){
		String donusmusIsim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*") +
								" " +
							soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");

		return donusmusIsim;
	}
}
