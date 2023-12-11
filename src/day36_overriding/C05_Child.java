package day36_overriding;

public class C05_Child extends C04_Parent {

	public void method1(int a) {
		/*
		override etmek istersen signature aynı olan bir method oluşturmak zorundayız.
		İsmin aynı olamsı yetmez.
		 */
	}
	public void method2(){

	}

	@Override
	public void method3() {
		// @Override notasyunu kullanmak zorunlu değildir.
		//@Override parent classtaki overriden method silinir yada sinature ı değişirse CTE verir.
		//@Override kullanılmayanlarda böyle bişey yoktur. PArent classtaki method kontrol edilmez.
	}

	public static void method4(){
//static olanlar overrride edilemez. signature aynı olsa bile
	}

	/*public final String methodd5(){
		//final olanlar override edilemezler.
		return null;
	}*/

	private void method6(){
		//private method override edilemez, aynı signature a sahip olsalar bile overrride edilemezler.
	}

	/*
	Her nekadar sinatura  a dahil olmasa da axess modifier da önemlidir.
	child class modifierı parent classtan daha kısıtlayıcı olamaz.
	mesela parent default ise
	child default protected public olur private olamaz.
	 */
	/*
	override olabilmesi için return type ı void veya primitive ise overriding methodun return type
	ı da aynı olmalıdır.
	Non-primitive olursa aynısı olabilir parent ile child arasında IS-A ilişkisi olmalıdır.
	parent -> object
	child -> String
	olabilir.
	 */

}
