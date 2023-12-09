package day11_StringManipulations;

public class C02_lastIndexOf {
	public static void main(String[] args) {

		String str = "Bu Java ogrenilecek";

		System.out.println(str.indexOf("e"));

		// e nin son kullanımını yazdırın
		System.out.println(str.lastIndexOf("e"));

		System.out.println(str.indexOf("u")+"---"+str.lastIndexOf("u"));

		if (str.indexOf("J")==-1){
			System.out.println("Metinde hiç J yok");
		} else if (str.indexOf("J")==str.lastIndexOf("J")){
			System.out.println("Sadece bir J vardır");
		} else {
			System.out.println("Birden fazla J vardır");
		}

		System.out.println(str.lastIndexOf("e",14)); //11 verir sondan başlayarak başa doğru arar.



	}
}
