package AbstractFactory;

public class FactoryProducer {
	
	FactoryAbstract produceFactory(String name){
		if(name.equals("firstcat")){
			return new FirstCatFactoryConcrete();
		}
		else if(name.equals("firstcat")){
			return new SecondCatFactoryConcrete();
		}
		else
			return null;
			
			
	}

}
