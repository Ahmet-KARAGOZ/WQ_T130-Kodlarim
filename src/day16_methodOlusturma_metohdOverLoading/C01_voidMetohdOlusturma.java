package day16_methodOlusturma_metohdOverLoading;

public class C01_voidMetohdOlusturma {
	public static void main(String[] args) {
		/*

		 */

		kisiBilgileriYazdir("ALI CAN","KAVAKLIGIL","1234567890123456");
		kisiBilgileriYazdir("Ahmet","KARAGOZ","9876543210654321");


	}
	public static void kisiBilgileriYazdir(String isim, String soyisim, String krediKartNo){
		System.out.println(
				"ism : " +
						isim.substring(0,1).toUpperCase() + isim.substring(1,3).toLowerCase() + isim.substring(3).replaceAll("\\w","*") +
						" " +
						soyisim.substring(0,1).toUpperCase() + soyisim.substring(1,3).toLowerCase() + soyisim.substring(3).replaceAll("\\w","*") +
						"\nkart no : " +
						"**** **** **** "+krediKartNo.substring(krediKartNo.length()-4)

		);
	}
}
