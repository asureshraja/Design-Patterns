package AbstractFactory;

public class SecondCatFactoryConcrete extends FactoryAbstract{


	SecondCatAbstract createFactory2(String name) {
		if(name.equals("Concrete1"))
			return new SecondCatConcrete1();
		else if(name.equals("Concrete2"))
			return new SecondCatConcrete2();
		else
			return null;
	}

	@Override
	FirstCatAbstract createFactory1(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
