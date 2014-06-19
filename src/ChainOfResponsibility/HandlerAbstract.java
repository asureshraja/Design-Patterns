package ChainOfResponsibility;

public abstract class HandlerAbstract {
	
	public abstract void doOperation(int val);
	public abstract void setNext(HandlerAbstract s);
}
