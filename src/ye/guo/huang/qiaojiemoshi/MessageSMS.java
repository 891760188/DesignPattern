package ye.guo.huang.qiaojiemoshi;

public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'" + message + "'��" + toUser);
	}

}
