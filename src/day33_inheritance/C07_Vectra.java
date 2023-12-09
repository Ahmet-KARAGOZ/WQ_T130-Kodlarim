package day33_inheritance;

public class C07_Vectra extends C06_Opel {
	String strChild = "Vectra Class Child";
	String model = "vectra";
	C07_Vectra(){
		super();
		System.out.println("Vectra Constructor çalıştı.");
	}

	public static void main(String[] args) {
		/*
			Bir class'dan obje olusturup,
            o class'da var olan ozellikleri edinebilmek icin
            MUTLAKA bir CONSTRUCTOR calismalidir

            extends keyword kullanan bir class'da
            her constructor'in ilk satirinda
            MUTLAKA bir constructor call bulunur

            EGER gorunur bir constructor call yoksa
            Java default olarak super() constructor call koyar
            yani default olarak once parent'daki
            parametresiz constructor'in calismasini ister

		 */
		C07_Vectra vectra = new C07_Vectra();
		System.out.println("vectra.strGP = " + vectra.strGP);
		System.out.println("vectra.strP = " + vectra.strP);
		System.out.println("vectra.strChild = " + vectra.strChild);
		System.out.println("vectra.marka = " + vectra.marka);
		System.out.println("vectra.model = " + vectra.model);
	}
}
