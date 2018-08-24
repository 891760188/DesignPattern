package ye.guo.huang.chouxianggongchang;

public class Test {
	public static void main(String[] args) {
		//获取工厂
		IFactory factory = new IFactoryImpl();
		IProduct1 car1= factory.creatCarInstance(TypeEmun.CAR1);
		IProduct1 car2= factory.creatCarInstance(TypeEmun.CAR2);
		car1.show();
		car2.show();
		
		IProduct2 tv = factory.creatTVInstance(TypeEmun.TV);
		tv.show();
		
	}
}
