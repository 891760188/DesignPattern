package ye.guo.huang.shipeiqimoshi.quesheng;
/**
 * ��ȱʡ����(Default Adapter)ģʽΪһ���ӿ��ṩȱʡʵ�֣����������Ϳ��Դ����ȱʡʵ�ֽ�����չ�������ش�ԭ�нӿڽ�����չ����Ϊ������ģʽ��һ��������ȱʡ������ģʽ��JAVA���������������Ӧ�á�
 * @author Administrator
 * ������ģʽ��������Ҫ�ı�Դ�Ľӿڣ��Ա���Ŀ��ӿ����ݡ�ȱʡ������������в�ͬ������Ϊ�˷��㽨��һ����ƽӹ������������ṩ��һ��ƽӹʵ�֡�
 *
 */
public class XiaoMing extends SomePeople {
	@Override
	public void sleep() {
		System.out.println("��ÿ�춼˯�ĺܺ�");
	}
	@Override
	public void eat() {
		System.out.println("��ÿ�춼�Եĺܺ�");
	}
}
