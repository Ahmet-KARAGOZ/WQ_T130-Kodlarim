package day11_StringManipulations;

public class C01_indexOf {
	public static void main(String[] args) {
		String str = "Java cok guzel bir programlama dilic";

			//Hem char hem String girebiliriz.
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf("o"));

		System.out.println(str.charAt(5)); //c

		System.out.println(str.indexOf("guz"));
		System.out.println("---------------");
		System.out.println(str.indexOf("i",str.indexOf("i")+1)); //ilk i den sonraki ikinci i değerini verir.

		System.out.println(str.indexOf("x")); // olmayanı istersek -1 değerini döner

		if (str.indexOf("c")==-1){
			System.out.println("Hiç c yok");
		}  else if (str.indexOf("c",str.indexOf("c")+1)==-1){
			System.out.println("ikinci c yok");
		} else {
			System.out.println("İkinci c nin yeri : "+str.indexOf("c")+1);
		}






	}
}
