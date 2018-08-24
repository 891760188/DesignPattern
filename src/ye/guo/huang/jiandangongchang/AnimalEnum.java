package ye.guo.huang.jiandangongchang;

public enum AnimalEnum {
	
	DUCK(1,"Ñ¼×Ó"),
	HEN(2,"Ä¸¼¦");
	
	private int code;
	private String name;
	
	private AnimalEnum(int code,String name) {
		this.code = code ;
		this.name = name ;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
