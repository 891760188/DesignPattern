package ye.guo.huang.zuhemoshi;

public class Client {
	public static void main(String[] args) {
		Folder root = new Folder("根文件夹");
		Folder a = new Folder("a文件夹");
		TextFile a1txt = new TextFile("a1.txt");
		
		TextFile b1txt = new TextFile("b1.txt");
		TextFile b2jpg = new TextFile("b2.jpg");
		TextFile b3rmvb = new TextFile("b3.rmvb");
		
		
		a.add(b3rmvb);
		a.add(b2jpg);
		a.add(b1txt);
		
		root.add(a);
		root.add(a1txt);
		
		root.display();
		
		
		System.out.println("--------------------------------------------------------------------------------------");
		
		
		a.remove(b2jpg);
		root.display();
		
		
	}
}
