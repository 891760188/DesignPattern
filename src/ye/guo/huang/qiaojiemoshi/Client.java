package ye.guo.huang.qiaojiemoshi;

public class Client {
	public static void main(String[] args) {
		MessageImplementor messageImplementor = new MessageEmail();
		AbstractMessage abstractMessage = new UrgencyMessage(messageImplementor);
		abstractMessage.sendMessage("«Î∫»“ª±≠≤Ë", "–°¿Ó");
	}
}
