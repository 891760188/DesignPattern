package ye.guo.huang.chouxianggongchang;

public interface IFactory {
	
	IProduct1 creatCarInstance(TypeEmun typeEmun);
	
	IProduct2 creatTVInstance(TypeEmun typeEmun);
}
