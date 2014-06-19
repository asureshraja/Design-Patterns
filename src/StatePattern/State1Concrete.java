package StatePattern;

public class State1Concrete implements StateIntf{

	public void doStateActions(ContextConcrete cc) {
		
		System.out.println("performing state1 operations");
		cc.setState(this);
		
	}

	public String toString(){
		return "State1Concrete";
	}
}
