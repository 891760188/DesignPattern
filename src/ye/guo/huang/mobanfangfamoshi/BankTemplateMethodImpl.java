package ye.guo.huang.mobanfangfamoshi;

/**
 * 模板方法模式
 * 定义一个操作中的算法骨架，而将一些步骤延迟到子类中
 * 处理某流程的步骤已经确定，其中某些节点的代码暂时不确定，可以将这些不确定的代码放到子类来实现。
 * 去银行办业务，银行给我们提供了一个模板就是：先取号，排对，办理业务（核心部分我们子类完成），给客服人员评分，完毕。
 * 这里办理业务是属于子类来完成的，其他的取号，排队，评分则是一个模板。
 * 
 * servlet中关于doGet/doPost方法的调用
 * 数据库访问的封装
 * 
 * @author Administrator
 *
 */

public  class BankTemplateMethodImpl extends BankTemplateMethod {

	@Override
	public void banyewu() {
		System.out.println("办业务impl");
		
	}
	
	public static void main(String[] args) {
		BankTemplateMethod bank = new BankTemplateMethodImpl();
		bank.liucheng();
	}

}
