package ye.guo.huang.zhuangshimoshi;

public class PatternDecorator extends Design {

	public PatternDecorator(Cxy cxy) {
		super(cxy);
	}

	@Override
	public void kills() {
		// TODO Auto-generated method stub
		super.kills();
		System.out.println("会涉及模式");
	}
}
