package ye.guo.huang.minglingmoshi;

/**
 * �ͻ���
 * @author Administrator
 *
 */

public class Test {
	public static void main(String[] args) {
		 //ͨ�������ߣ�invoker�������������command������������е������������ִ���ߣ�Receiver��
	    Command command = new ConcreteCommand(new Receiver());
	    Invoker invoker = new Invoker(command);
	    invoker.call();
	}
}
