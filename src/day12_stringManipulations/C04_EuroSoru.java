package day12_stringManipulations;

public class C04_EuroSoru {
	public static void main(String[] args) {

		/*
		Soru 2 : 	Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
 					input1 : “15.30 €” , input2 : “11.40 €”
 					output : 26.70 €
		 */

		String input1 = "15.35 €";
		String input2 = "11.40 €";

		input1 = input1.replaceAll("\\D", "");
		input2 = input2.replaceAll("\\D", "");
		System.out.println("input1 = " + input1);
		System.out.println("input2 = " + input2);

		int input11 = Integer.valueOf(input1);
		int input22 = Integer.parseInt(input2);

		double toplam = input11 + input22;
		System.out.println("toplam = " + toplam);

		System.out.println(toplam / 100 + " €");

	}
}
