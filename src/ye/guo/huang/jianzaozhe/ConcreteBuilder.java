package ye.guo.huang.jianzaozhe;

/**
 * 针对不同的商业逻辑，具体化复杂对象各个部分的创建，在创建完成后，提供完整的商品实例
 * @author Administrator
 *
 */
public class ConcreteBuilder implements PersonBuilder {
	
	private Person person;
	
	public ConcreteBuilder() {
		person = new Person();
	}
	
	@Override
	public void buildHead() {
		person.setHead("创建头部");

	}

	@Override
	public void buildBody() {
		person.setBody("body");

	}

	@Override
	public void buildFood() {
		person.setFoot("foot");

	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return this.person;
	}

}
