package ObserverPattern;

public class Observer2Concrete implements ObserverIntf{
	
	public Observer2Concrete(SubjectConcrete sc){
		sc.attach(this);
	}
int stateval;
public void getState(){
	System.out.println("Current state is "+stateval);
}

public void updateState(int stateval){
	this.stateval=stateval;
}

}
