package ye.guo.huang.jianzaozhe;

/**
 * 	给出一个抽象接口，以规范产品对象各个组成部分的建造，这个接口规定了对复杂对象需要对哪些部分进行创建，并不涉及具体对象的创建
 * @author Administrator
 *
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFood();
	Person buildPerson();
}
