package ye.guo.huang.shipeiqimoshi.lei;

import ye.guo.huang.shipeiqimoshi.Adaptee;
import ye.guo.huang.shipeiqimoshi.Target;


public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		
		super.specificRequest();  
	}

}
