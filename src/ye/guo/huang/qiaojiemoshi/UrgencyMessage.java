package ye.guo.huang.qiaojiemoshi;

public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        message = "�Ӽ���" + message;
        super.sendMessage(message, toUser);
    }

    public Object watch(String messageId) {
        //��ȡ��Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�
        return null;

    }
}
