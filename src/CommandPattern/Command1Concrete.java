package CommandPattern;

public class Command1Concrete implements CommandIntf{

	ReceiverConcrete r;
	public void doCommand1(ReceiverConcrete r){
		this.r=r;
	}
	public void execute() {
		r.alterToCommand1();
		System.out.println("Command1 executed");
	}

}
