package ye.guo.huang.zuhemoshi;

public class VideoFile extends File{

	public VideoFile(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		 System.out.println("����Ӱ���ļ����ļ�����" + super.getName());
	}

}
