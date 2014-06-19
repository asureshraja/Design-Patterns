package FactoryPattern;

public class FactoryConcrete {
public SuperAbstract CreateConcrete(String name){
	if(name.equals("Concrete1")){
		return new Concrete1();
	}
	else if(name.equals("Concrete2")){
		return new Concrete2();
	}
	else
		{
		System.out.println("Error invalid name");
		return null;
		}
}
}
