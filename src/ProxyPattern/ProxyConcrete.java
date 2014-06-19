package ProxyPattern;

public class ProxyConcrete implements RealIntf{
	private RealConcrete rc;

	public void doOperation() {
		new RealConcrete().operations();
	}
	

}
