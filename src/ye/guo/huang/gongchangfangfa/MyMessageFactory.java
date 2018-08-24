package ye.guo.huang.gongchangfangfa;

import java.util.HashMap;
import java.util.Map;

public class MyMessageFactory implements IMyMessageFactory {

	@Override
	public IMyMessage creatMessage(MessageTypeEnum messageTypeEnum) {

		IMyMessage myMessage = null ;  
		//产品参数
		Map<String, Object> messageParam = new HashMap<String, Object>();  
		
		switch (messageTypeEnum.getCode()) {
			case 2://短信
				  myMessage = new MyMessageSms();  
		           messageParam.put("PHONENUM", "123456789");  
				break;
			case 1://email
				 myMessage = new MyMessageEmail();  
		            messageParam.put("EMAIL", "test@test.com");  
				break;
	
			default:
				break;
		}
		
		  myMessage.setMessageParam(messageParam);  
	     return myMessage;  
	}

}
