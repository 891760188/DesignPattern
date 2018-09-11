package ye.guo.huang.shipeiqimoshi.duixiang;

import ye.guo.huang.shipeiqimoshi.Adaptee;

public class Client {
	public static void main(String[] args) {
		Adapter adapter = new Adapter(new Adaptee());
		adapter.request();
	}
}
