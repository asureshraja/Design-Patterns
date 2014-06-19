package CommandPattern;

public class Client {
	public static void main(String[] args){
		ReceiverConcrete r=new ReceiverConcrete();
		Command1Concrete c1c = new Command1Concrete();
		c1c.doCommand1(r);
		Command2Concrete c2c = new Command2Concrete();
		c2c.doCommand2(r);
		InvokerConcrete ic = new InvokerConcrete();
		ic.storeAndExecute(c1c);
		ic.storeAndExecute(c2c);
		ic.rollback();
		
	}
}
