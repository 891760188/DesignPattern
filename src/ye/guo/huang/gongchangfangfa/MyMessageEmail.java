package ye.guo.huang.gongchangfangfa;

public class MyMessageEmail extends MyAbstractMessage {

	@Override
	public void sendMesage() throws Exception {
		
        if (null == getMessageParam() || null == getMessageParam().get("EMAIL")  
                || "".equals(getMessageParam().get("EMAIL"))) {  
            throw new Exception("���Ͷ���,��Ҫ����EMAIL����");// Ϊ�˼�����쳣Ҳ���Զ�����  
        }// �����ʼ����ݣ��Լ���������Э������ȵȶ�Ҫ����  
		
		System.out.println("�����ʼ�������֪ͨ��" + getMessageParam().get("EMAIL")); 
	}

}
