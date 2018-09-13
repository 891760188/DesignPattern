package ye.guo.huang.waiguanmoshi;

public class Facede {
	public void all() {
		System.out.println("外观模式的脸");
		ModulA a = new ModulA();
		a.action();
		ModulB b = new ModulB();
		b.action();
		ModulC c = new ModulC();
		c.action();
	}
}
