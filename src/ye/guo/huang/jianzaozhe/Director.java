package ye.guo.huang.jianzaozhe;


/**
 * 
 * 分离对象子组件的单独构造，构造出复杂对象，将对象的构建和组装这两个步骤分开
 * 一个对象的构建需要几个步骤为一块，另外一块去把这写步骤进行组装
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
