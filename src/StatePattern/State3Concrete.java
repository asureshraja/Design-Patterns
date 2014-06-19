package StatePattern;

public class State3Concrete implements StateIntf{

	public void doStateActions(ContextConcrete cc) {
		
		System.out.println("performing state3 operations");
		cc.setState(this);
		
	}

	public String toString(){
		return "State3Concrete";
	}
}
