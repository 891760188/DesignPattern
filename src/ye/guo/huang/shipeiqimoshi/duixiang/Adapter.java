package ye.guo.huang.shipeiqimoshi.duixiang;

import ye.guo.huang.shipeiqimoshi.Adaptee;
import ye.guo.huang.shipeiqimoshi.Target;

public class Adapter implements Target {
	
	private Adaptee adaptee ;
	
	public Adapter(Adaptee adaptee ) {
		this.adaptee = adaptee ;
	}
	
	@Override
	public void request() {

		adaptee.specificRequest();
		
	}

}
