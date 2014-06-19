package ProxyPattern;

public class RealConcrete implements RealIntf{

	public void doOperation() {
		System.out.println("Top operations");
	}
	public void doIntensiveOperation() {
		System.out.println("Intensive operations");
	}
	
	public void operations(){
		System.out.println("All operations including intensive ops.");
	}

}
