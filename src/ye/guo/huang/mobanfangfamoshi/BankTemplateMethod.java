package ye.guo.huang.mobanfangfamoshi;

/**
 * ģ�巽��ģʽ
 * ����һ�������е��㷨�Ǽܣ�����һЩ�����ӳٵ�������
 * ����ĳ���̵Ĳ����Ѿ�ȷ��������ĳЩ�ڵ�Ĵ�����ʱ��ȷ�������Խ���Щ��ȷ���Ĵ���ŵ�������ʵ�֡�
 * ȥ���а�ҵ�����и������ṩ��һ��ģ����ǣ���ȡ�ţ��Ŷԣ�����ҵ�񣨺��Ĳ�������������ɣ������ͷ���Ա���֣���ϡ�
 * �������ҵ����������������ɵģ�������ȡ�ţ��Ŷӣ���������һ��ģ�塣
 * 
 * @author Administrator
 *
 */

public abstract class BankTemplateMethod {

	public void quhao() {
		System.out.println("quhao");
	}
	
	public abstract void banyewu();
	
	public void pingfen() {
		System.out.println("pingfen");
	}
	
	public void liucheng() {
		quhao();
		banyewu();
		pingfen();
	}
	
	public static void main(String[] args) {
		BankTemplateMethod bank = new BankTemplateMethod() {
			
			@Override
			public void banyewu() {
				
				System.out.println("��ҵ��");
				
			}
		};
		bank.liucheng();
	}
}
