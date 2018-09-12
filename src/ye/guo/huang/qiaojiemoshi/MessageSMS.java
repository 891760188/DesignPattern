package ye.guo.huang.qiaojiemoshi;

public class MessageSMS implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("使用站内短消息的方式，发送消息'" + message + "'给" + toUser);
	}

}
