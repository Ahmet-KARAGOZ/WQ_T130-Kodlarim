package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_listSetMethodu {
	public static void main(String[] args) {
		List<String> harfler = new ArrayList<>();
		harfler.add("J");
		harfler.add("a");
		harfler.add("v");
		harfler.add("a");
		System.out.println("harfler = " + harfler);


		//v ile a arasına "b" ekleyelin

		harfler.add(3,"b");
		System.out.println("harfler = " + harfler); //[J, a, v, b, a]

		harfler.add(4,"c");
		System.out.println("harfler = " + harfler);

		//c harfini b olarak update edin

		harfler.set(4,"b");
		System.out.println("harfler = " + harfler);

		System.out.println(harfler.set(3,"l")); // b  attığı elemanı yazdırır.
		System.out.println("harfler = " + harfler);


	}
}
