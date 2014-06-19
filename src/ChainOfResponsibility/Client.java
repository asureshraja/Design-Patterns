package ChainOfResponsibility;

public class Client {
	public static void main(String[] args){
		HandlerAbstract hc1=new HandlerConcrete1();
		HandlerAbstract hc2=new HandlerConcrete2();
		hc1.setNext(hc2);
		
		hc1.doOperation(2);
	}
}
