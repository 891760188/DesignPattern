package ye.guo.huang.waiguanmoshi;

public class Client {
	public static void main(String[] args) {
		Facede facede = new Facede();
		/**
		 * 客户端直接调用系统的脸，可以调用到子系统内部的所有方法
		 */
		facede.all();
	}
}
