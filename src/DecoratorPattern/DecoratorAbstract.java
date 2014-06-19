package DecoratorPattern;

public abstract class DecoratorAbstract implements PlainIntf{
	public void additionaloperations(){
		System.out.println("adding additional operations");
		plainOperation();
	}
}
