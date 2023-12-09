package day12_stringManipulations;

public class C01_replace {
	public static void main(String[] args) {

		String str = "Hava Candır.";

		str.replace("H","J");
		System.out.println(str);
		System.out.println(str.replace("H","J"));
		str= str.replace("Hava","Java").replace(".","");
		System.out.println(str);
		System.out.println(str.replaceFirst("a","A")); //Sadece ilk a değişir.

		str = "Ali Uzunkavaklaraltındauyumazoğlu";
		System.out.println(str.replace('u','U'));

		//ReplaceAll
		str="sjfnpjbsn9849ajfvnaj9q384jjgqıj4gpın";
		//Tüm harfleri yada Tüm rakamları değiştirmek için kullanılır.
		//Regular Expressions
		str.replaceAll("\\d","");
		System.out.println(str);


	}
}
