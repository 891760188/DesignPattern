package ye.guo.huang.qiaojiemoshi;

public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("ʹ��Email�ķ�ʽ��������Ϣ'" + message + "'��" + toUser);
	}

}
