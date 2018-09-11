package ye.guo.huang.minglingmoshi;

/**
 * 抽象命令类：抽象的命令，可以根据不同类型的命令写出不同的实现
 * @author Administrator
 *
 */

public interface Command {
	//调用命令
    void execute();
}
