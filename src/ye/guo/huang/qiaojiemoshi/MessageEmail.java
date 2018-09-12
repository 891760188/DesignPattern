package ye.guo.huang.qiaojiemoshi;

public class MessageEmail implements MessageImplementor {

	@Override
	public void send(String message, String toUser) {
		// TODO Auto-generated method stub
		System.out.println("使用Email的方式，发送消息'" + message + "'给" + toUser);
	}

}
