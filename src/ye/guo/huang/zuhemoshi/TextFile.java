package ye.guo.huang.zuhemoshi;

public class TextFile extends File {

	public TextFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("这是文本文件name="+super.getName());
		
	}


}
