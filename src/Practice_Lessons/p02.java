package Practice_Lessons;

public class p02 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello World ve \"Hello World\" yazdırınız");

		System.out.println("Hello World \n\"Merhaba Dünya\"");

		System.out.println("Hello World\t\t\"Merhaba Dünya\"");

		System.out.println("*\n\t*\n\t\t*\n\t\t\t*");

		System.out.println("\t\t\t\t*");
		System.out.println("\t\t\t*");
		System.out.println("\t\t*");
		System.out.println("\t*");
		System.out.println("*");

		for (int i =0; i<10; i++){
			//System.out.println("*\n\t*\n\t\t*\n\t\t\t*");
			//Thread.sleep(1000);

			System.out.println("\t\t\t\t*");
			Thread.sleep(1000);
			System.out.println("\t\t\t*");
			Thread.sleep(1000);
			System.out.println("\t\t*");
			Thread.sleep(1000);
			System.out.println("\t*");
			Thread.sleep(1000);
			System.out.println("*");

			Thread.sleep(1000);
			System.err.println();

		}
	}
}
