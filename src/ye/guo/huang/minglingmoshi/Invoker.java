package ye.guo.huang.minglingmoshi;

/**
 * ������/�����ߣ�����ִ����������Ķ���
 * @author Administrator
 *
 */

public class Invoker {
	private Command command;//����������������
    public Invoker(Command command) {
        super();
        this.command = command;
    }
    public void call(){
        //�����ߵ����������ִ��������Ǹ�execute����
        command.execute();
    }
}
