package StatePattern;

public class State2Concrete implements StateIntf{

	public void doStateActions(ContextConcrete cc) {
		if(cc.getState()!=null)
		if (cc.getState().equals("State1Concrete")){
			System.out.println("I am moving from state1 to state2");
			System.out.println("performing state2 operations");
			cc.setState(this);
		}
		else{
			System.out.println("Error: Context in state1 only be processed");
		}
		
		
	}

	public String toString(){
		return "State2Concrete";
	}
}
