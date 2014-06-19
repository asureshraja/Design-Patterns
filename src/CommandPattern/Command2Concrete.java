package CommandPattern;

public class Command2Concrete implements CommandIntf {
	
	ReceiverConcrete r;
	public void doCommand2(ReceiverConcrete r){
		this.r=r;
	}
	public void execute() {
		r.alterToCommand2();
		System.out.println("Command2 executed");
		
	}



}
