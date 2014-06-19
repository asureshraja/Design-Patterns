package StatePattern;

public class ContextConcrete {
private StateIntf state=new State3Concrete();
public String getState(){
	return state.toString();
}
public void setState(StateIntf state1){
	state = state1;
}
public String toString(){
	return "I am in "+state;
}
}
