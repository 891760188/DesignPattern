package ye.guo.huang.zuhemoshi;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {
	
	private List<File> files ;

	public Folder(String name) {
		super(name);
		files = new ArrayList<File>();
	}

	@Override
	public void display() {
		System.out.println("ÎÄ¼þ¼Ðname="+super.getName());
		for (File file : files) {
			file.display();
		}
		
	}

	@Override
	public void add(File file) {
		files.add(file);
		
	}

	@Override
	public void remove(File file) {
		files.remove(file);
	}
	
	

}
