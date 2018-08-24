package ye.guo.huang.jiandangongchang;

public class SimpleFactory {
	
	public static Animal getInstance(AnimalEnum animalEnum) {
		if(animalEnum != null) {
			if(1 == animalEnum.getCode()) {
				return new Duck();
			}else if(2 == animalEnum.getCode()) {
				return new Hen();
			}else {
				return null ;
			}
		}else {
			return null ;
		}
		
	}
	
}
