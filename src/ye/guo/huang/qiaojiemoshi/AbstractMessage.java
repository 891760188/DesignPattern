package ye.guo.huang.qiaojiemoshi;
/**
 * ������Ϣ��
 * @author Administrator
 *
 */
public class AbstractMessage {
	 protected MessageImplementor impl;
	 public AbstractMessage(MessageImplementor impl) {
	    this.impl = impl;
	 }
	 public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
