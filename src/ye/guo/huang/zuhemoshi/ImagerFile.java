package ye.guo.huang.zuhemoshi;

public class ImagerFile extends File{

	public ImagerFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	 public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }

}
