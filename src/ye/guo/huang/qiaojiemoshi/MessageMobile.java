package ye.guo.huang.qiaojiemoshi;

public class MessageMobile implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("ʹ���ֻ�����Ϣ�ķ�ʽ��������Ϣ'" + message + "'��" + toUser);
	}

}
