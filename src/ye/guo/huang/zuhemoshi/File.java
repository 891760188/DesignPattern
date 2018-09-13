package ye.guo.huang.zuhemoshi;

public abstract class File {
	private String name ;
	
	public File(String name) {
		this.name = name ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void display();
	
	public  void remove(File file) {};

	public void add(File file) {}
}
