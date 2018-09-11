package ye.guo.huang.shipeiqimoshi.lei;

import ye.guo.huang.shipeiqimoshi.ConcreteTarget;

public class Client {
	public static void main(String[] args) {
		ConcreteTarget concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		Adapter adapter = new Adapter();
		adapter.request();
		
	}
}
