package ye.guo.huang.jiandangongchang;

/**
 * 一个工厂，根据我们传进去的参数的不同，生产出不同的对象，这些对象都有相同的地方，实现了一个相同的接口的
 * 
 * 简单的工厂模式，最终的工厂方法是静态的，根据参数的不同，生产出不同的对象产品
 * 几个角色：所有产品的父类，继承父类的产品子类，还有就是工厂
 * 样模块清晰化，每个部分都各司其职，分工明确，代码就实现最渐层意义上的“可维护”啦。说到缺点，当我们需要增加一产品，比如在计算机中加入一个新的功能，可以求M的N次方，这样个小功能我们就要去添加一个新的类，同时我们需要在Factory中改动到switch里面的代码，这是耦合性很高的表现啦，所以我们就有了“工厂模式”的出现啦。 
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Animal animal1 = SimpleFactory.getInstance(AnimalEnum.DUCK);
		animal1.myName();
		Animal animal2 = SimpleFactory.getInstance(AnimalEnum.HEN);
		animal2.myName();
		Animal animal3 = SimpleFactory.getInstance(null);
		if(null != animal3) {
			animal3.myName();
		}
		
	}
}
