package AbstractFactory;

public class FirstCatFactoryConcrete extends FactoryAbstract{


	FirstCatAbstract createFactory1(String name) {
		if(name.equals("Concrete1"))
			return new FirstCatConcrete1();
		else if(name.equals("Concrete2"))
			return new FirstCatConcrete2();
		else
			return null;
	}

	@Override
	SecondCatAbstract createFactory2(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
