package day28_passByValue;

public class C02_StaticOlmayanBloklar {

	C02_StaticOlmayanBloklar(){
		System.out.println("Constructur çalıştı.");
	}
	public static void main(String[] args) {
		System.out.println("Main method çalıştı.");

		C02_StaticOlmayanBloklar obj1 = new C02_StaticOlmayanBloklar();
		C02_StaticOlmayanBloklar obj2 = new C02_StaticOlmayanBloklar();

	}


	//Static olmayan bloklar obje oluşturulacağı zaman Constructordan hemen önce çalışır.

	//Bir obje oluştrulmadan önce yapılması gerekn ön ayarlar için kullanılır.
	{
		System.out.println("Static OLMAYAN Blok çalıştı.");
	}
}
