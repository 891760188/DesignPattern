package ye.guo.huang.gongchangfangfa;

/**
 * 工厂方法模式的工厂接口
 * @author Administrator
 *
 */

public interface IMyMessageFactory {
	public IMyMessage creatMessage(MessageTypeEnum messageTypeEnum);
}
