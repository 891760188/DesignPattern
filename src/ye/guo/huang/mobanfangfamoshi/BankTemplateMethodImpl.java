package ye.guo.huang.mobanfangfamoshi;

/**
 * ģ�巽��ģʽ
 * ����һ�������е��㷨�Ǽܣ�����һЩ�����ӳٵ�������
 * ����ĳ���̵Ĳ����Ѿ�ȷ��������ĳЩ�ڵ�Ĵ�����ʱ��ȷ�������Խ���Щ��ȷ���Ĵ���ŵ�������ʵ�֡�
 * ȥ���а�ҵ�����и������ṩ��һ��ģ����ǣ���ȡ�ţ��Ŷԣ�����ҵ�񣨺��Ĳ�������������ɣ������ͷ���Ա���֣���ϡ�
 * �������ҵ����������������ɵģ�������ȡ�ţ��Ŷӣ���������һ��ģ�塣
 * 
 * servlet�й���doGet/doPost�����ĵ���
 * ���ݿ���ʵķ�װ
 * 
 * @author Administrator
 *
 */

public  class BankTemplateMethodImpl extends BankTemplateMethod {

	@Override
	public void banyewu() {
		System.out.println("��ҵ��impl");
		
	}
	
	public static void main(String[] args) {
		BankTemplateMethod bank = new BankTemplateMethodImpl();
		bank.liucheng();
	}

}
