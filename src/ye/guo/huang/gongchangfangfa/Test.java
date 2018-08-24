package ye.guo.huang.gongchangfangfa;

public class Test {
	public static void main(String[] args) throws Exception {
		IMyMessageFactory factory = new MyMessageFactory();
		IMyMessage myMessage = null ;
		
		//Email
		myMessage = factory.creatMessage(MessageTypeEnum.SMS);
		
		myMessage.sendMesage();
	}
}
