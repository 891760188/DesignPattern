package ye.guo.huang.zhuangshimoshi;

public class Design implements Cxy {
	private Cxy cxy ;
	public Design(Cxy cxy) {
		this.cxy = cxy ;
	}
	public void kills() {
		cxy.kills();
    }
}
