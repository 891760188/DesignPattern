package ye.guo.huang.gongchangfangfa;

import java.util.Map;

/**
 * ��������ģʽ�Ĳ�Ʒ�ӿ�
 * @author Administrator
 *
 */
public interface IMyMessage {
	public Map<String, Object> getMessageParam();  
	  
    public void setMessageParam(Map<String, Object> messageParam);  
  
    public void sendMesage() throws Exception;// ����֪ͨ/��Ϣ  
}
