package ye.guo.huang.gongchangfangfa;

public enum MessageTypeEnum {
	
	EMAIL(1,"�ʼ�"),
	SMS(2,"����");
	
	private int code ;
	private String name ;
	private MessageTypeEnum(int code,String name) {
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
