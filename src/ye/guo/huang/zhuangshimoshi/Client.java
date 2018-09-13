package ye.guo.huang.zhuangshimoshi;

public class Client {
	public static void main(String[] args) {
		PhpCxy phpCxy = new PhpCxy();
		phpCxy.kills();
		System.out.println("------------");
		
		PatternDecorator pattern = new PatternDecorator(phpCxy);
		pattern.kills();
	}
}
