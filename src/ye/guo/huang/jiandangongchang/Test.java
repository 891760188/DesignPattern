package ye.guo.huang.jiandangongchang;

/**
 * һ���������������Ǵ���ȥ�Ĳ����Ĳ�ͬ����������ͬ�Ķ�����Щ��������ͬ�ĵط���ʵ����һ����ͬ�Ľӿڵ�
 * 
 * �򵥵Ĺ���ģʽ�����յĹ��������Ǿ�̬�ģ����ݲ����Ĳ�ͬ����������ͬ�Ķ����Ʒ
 * ������ɫ�����в�Ʒ�ĸ��࣬�̳и���Ĳ�Ʒ���࣬���о��ǹ���
 * ��ģ����������ÿ�����ֶ���˾��ְ���ֹ���ȷ�������ʵ����������ϵġ���ά��������˵��ȱ�㣬��������Ҫ����һ��Ʒ�������ڼ�����м���һ���µĹ��ܣ�������M��N�η���������С�������Ǿ�Ҫȥ���һ���µ��࣬ͬʱ������Ҫ��Factory�иĶ���switch����Ĵ��룬��������Ժܸߵı��������������Ǿ����ˡ�����ģʽ���ĳ������� 
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
