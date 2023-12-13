package day38_Interfaces;

public interface I01_Interface {
	/*
	Class değildir.
	KURAL 1 : Full abstraction sağlar.
	KURAL 2 : İçinde  oluşturulan methodlar için Public veya abstrac keywordlerini yazsak ta yazmasakta bu özellikleri taşırlar.
	KURAL 3 : variable ların hepsi de public, static ve final dır.




	 */

	public abstract void method1();
	//Modifier 'abstract' is redundant for interface methods
	//Modifier 'public' is redundant for interface members

	void method4();
}
