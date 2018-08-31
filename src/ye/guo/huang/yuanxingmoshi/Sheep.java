package ye.guo.huang.yuanxingmoshi;

import java.util.Date;

public class Sheep implements Cloneable {
	private String name ;
	private Integer age ;
	private Date birthday ;
	
	
	public Sheep(String name, Date birthday) {
		super();
		this.name = name;
		this.birthday = birthday;
	}

	@Override
	protected Sheep clone() throws CloneNotSupportedException {
		Sheep sheep = (Sheep)super.clone();
		return sheep;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", birthday="
				+ birthday + "]";
	}
	
	
	
	
}
