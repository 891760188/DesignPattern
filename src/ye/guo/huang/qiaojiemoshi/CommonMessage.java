package ye.guo.huang.qiaojiemoshi;

public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    public void sendMessage(String message, String toUser) {
        //������ͨ��Ϣ��ʲô�����ɣ�ֱ�ӵ�����ķ���������Ϣ���ͳ�ȥ�Ϳ�����
        super.sendMessage(message, toUser);
    }
}

