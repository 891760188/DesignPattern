package ye.guo.huang.chouxianggongchang;

public class IFactoryImpl implements IFactory {

	@Override
	public IProduct1 creatCarInstance(TypeEmun typeEmun) {
		IProduct1  pro = null ;
		
		switch (typeEmun.getCode()) {
		case 1:
			pro = new product11();
			break;
		case 2:
			pro = new product12();
			break;
		}
		
		return pro;
	}

	@Override
	public IProduct2 creatTVInstance(TypeEmun typeEmun) {
		IProduct2  pro = null ;
		
		switch (typeEmun.getCode()) {
		case 3:
			pro = new Product2();
			break;

		}
		
		return pro;
	}

}
