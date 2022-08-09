
public class Main {

	public static void main(String[] args) {
		
		Interface1 i1 = new ConcreteClass1();
		AbstractDemo ad = (AbstractDemo)i1;
		//ad.
		ConcreteClass1 cc1 = (ConcreteClass1) ad;
		//cc1.
		
		ad.method1();
		ad.method2();
		ad.method3();
		ad.method4();
		ad.method5();
		ad.method6();
		
		// we will also get access to all extra methods from CC1 class
		cc1.method1();
		cc1.method2();
		cc1.method3();
		cc1.method4();
		cc1.method5();
		cc1.method6();
		

	}

}
