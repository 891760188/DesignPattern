package ye.guo.huang.yuanxingmoshi;

import java.util.Date;

/**
 * ԭ��ģʽ
 * ��һ�����󴴽�����һ�����󣬲���֪��������ϸ��
 * ����Java�еĿ�¡��������һ�������и��Ƴ���һ������
 * �ٶȿ죬���ܸߣ�����֪������Ĵ���ϸ��
 * 
 * Spring�����bean����Ĵ���������ģʽ������ģʽ����ԭ��ģʽ
 * ԭ��ģʽ���ó��������ĳ������new�Ĺ����кܺ�ʱ������Կ���ʹ��ԭ��ģʽ��
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
