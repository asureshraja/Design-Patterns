package ChainOfResponsibility;

public class HandlerConcrete2 extends HandlerAbstract{

	HandlerAbstract next=null;
	@Override
	public void doOperation(int val) {
		if(val==2)
			System.out.println("executed by handler2");
		else
			passit(val);
	}
	public void passit(int val){
		this.next.doOperation(val);
	}

	@Override
	public void setNext(HandlerAbstract s) {
		this.next=s;
		
	}

}
