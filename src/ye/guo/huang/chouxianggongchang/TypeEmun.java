package ye.guo.huang.chouxianggongchang;

public enum TypeEmun {
	
	CAR1(1,"小车"),
	CAR2(2,"卡车"),
	TV(3,"电视");
	
	private int code ;
	private String name;
	
	private TypeEmun(int code,String name) {
		this.code = code;
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
