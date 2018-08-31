package ye.guo.huang.jianzaozhe;


/**
 * 
 * �������������ĵ������죬��������Ӷ��󣬽�����Ĺ�������װ����������ֿ�
 * һ������Ĺ�����Ҫ��������Ϊһ�飬����һ��ȥ����д���������װ
 * 
 * 
 * @author Administrator
 *
 */

public class Director {
	
	public Person constructProduct(PersonBuilder personBuilder) {
		personBuilder.buildHead();
		personBuilder.buildBody();
		personBuilder.buildFood();
		return personBuilder.buildPerson() ;
	}
	
	public static void main(String[] args) {
		Director director = new Director();
		Person person = director.constructProduct(new ConcreteBuilder());
		System.out.println(person);
	}
	
	
}
