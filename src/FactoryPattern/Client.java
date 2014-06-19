package FactoryPattern;

public class Client {
	public static void main(String[] args){
		FactoryConcrete fc=new FactoryConcrete();
		fc.CreateConcrete("Concrete1").UnCommonOperations();
		fc.CreateConcrete("Concrete2").UnCommonOperations();
	}
}
