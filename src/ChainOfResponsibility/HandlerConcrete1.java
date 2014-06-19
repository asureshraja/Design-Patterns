package ChainOfResponsibility;

public class HandlerConcrete1 extends HandlerAbstract{

	HandlerAbstract next=null;
	@Override
	public void doOperation(int val) {
		if(val==1)
			System.out.println("executed by handler1");
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
