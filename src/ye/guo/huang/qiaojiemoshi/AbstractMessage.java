package ye.guo.huang.qiaojiemoshi;
/**
 * 定义消息类
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
