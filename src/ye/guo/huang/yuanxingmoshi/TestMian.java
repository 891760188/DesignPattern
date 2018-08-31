package ye.guo.huang.yuanxingmoshi;

import java.util.Date;

/**
 * 原型模式
 * 从一个对象创建出另一个对象，不用知道创建的细节
 * 就是Java中的克隆技术，从一个对象中复制出另一个对象。
 * 速度快，性能高，不用知道对象的创建细节
 * 
 * Spring框架中bean对象的创建就两种模式：单例模式或者原型模式
 * 原型模式适用场景：如果某个对象new的过程中很耗时，则可以考虑使用原型模式。
 * 
 * @author Administrator
 *
 */

public class TestMian {
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep s1 = new Sheep("s1", new Date());
		Sheep s2 = s1.clone();
		System.out.println("s1="+s1.toString());
		System.out.println("s2="+s2.toString());
		System.out.println("\n");
		s1.setBirthday(new Date(System.currentTimeMillis()+10000000));
		s1.setAge(100);
		System.out.println("s1="+s1.toString());
		System.out.println("\r");
		System.out.println("s2="+s2.toString());
		
		
	}
}
