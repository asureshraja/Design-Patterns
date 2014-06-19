package DecoratorPattern;

public class Client {
	public static void main(String[] args){
		PlainIntf pi1 = new PlainConcrete();
		DecoratorAbstract pi2 = new DecoratorConcrete();
		pi1.plainOperation();
		pi2.additionaloperations();
	}
}
