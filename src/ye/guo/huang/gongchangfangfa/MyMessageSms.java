package ye.guo.huang.gongchangfangfa;

public class MyMessageSms extends MyAbstractMessage {

	@Override
	public void sendMesage() throws Exception {
		 // TODO Auto-generated method stub  
        if (null == getMessageParam()  
                || null == getMessageParam().get("PHONENUM")  
                || "".equals(getMessageParam().get("PHONENUM"))) {  
            throw new Exception("���Ͷ���,��Ҫ����PHONENUM����");// Ϊ�˼�����쳣Ҳ���Զ�����  
        }// ���������Ϣ���Լ���������Э������ȵȶ�Ҫ����  
  
        System.out.println("���Ƕ��ţ�����֪ͨ��" + getMessageParam().get("PHONENUM"));  
	}

}
