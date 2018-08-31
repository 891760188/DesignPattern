package ye.guo.huang.jianzaozhe;

/**
 * ��Բ�ͬ����ҵ�߼������廯���Ӷ���������ֵĴ������ڴ�����ɺ��ṩ��������Ʒʵ��
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
		person.setHead("����ͷ��");

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
