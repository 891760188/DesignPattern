package ye.guo.huang.zuhemoshi;

public class VideoFile extends File{

	public VideoFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		 System.out.println("这是影像文件，文件名：" + super.getName());
	}

}
