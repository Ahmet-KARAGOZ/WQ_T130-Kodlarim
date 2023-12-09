package day28_passByValue;

public class C01_StaticBlocks {

	C01_StaticBlocks(){
		System.out.println("Constructor çalıştı.");
	}
	public static void main(String[] args) {
		System.out.println("Main Method çalıştı.");
		C01_StaticBlocks obj = new C01_StaticBlocks();

	}

	static { // Bu yapıya static blok denir.
			//Herşeyden önce main methodtan bile önce çalışır.
			//main çalışmadan yapılmsı gereken ön ayar varsa static blok kullanılır.

			//Birden fazla static olabilir. Birden fazla varsa kendi içlerinde önce yukarıdaki çalışır.
		System.out.println("Static blok çalıştı");
	}
	static {
		System.out.println("İkinci Static blok çalıştı.");

	}

	public static void method1(){
		System.out.println("Method1 çalıştı.");
	}
}
