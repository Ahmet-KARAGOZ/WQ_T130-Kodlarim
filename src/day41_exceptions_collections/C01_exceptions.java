package day41_exceptions_collections;

public class C01_exceptions {
	public static void main(String[] args) {

		//Satır atşamak için kullanılabilecek bir yöntemdir.

		int sayi = 11;


		try {
			System.out.println("satır1");
				if (sayi<0) throw new IllegalArgumentException();
			System.out.println("satır2");
				if (sayi%2==0) throw new RuntimeException();
			System.out.println("satır3");
			System.out.println("satır4");
			System.out.println("satır5");
		} catch (IllegalArgumentException e) {
			System.out.println("Sayi negatif 2,3,4,5 atlandı.");
		} catch (RuntimeException e){
			System.out.println("Sayi çift olduğundan 3,4,5 atlandı.");
		}
		System.out.println("Buradan çalışmaya devam...");
	}
}
