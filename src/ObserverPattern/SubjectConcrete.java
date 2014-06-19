package ObserverPattern;
import java.util.*;
public class SubjectConcrete {

	int stateval;
	ArrayList observers=new ArrayList();
	int id=0;
public int attach(ObserverIntf observer){
	observers.add(observer);
	return id++;
}

public void detach(ObserverIntf observer,int id){
	observers.remove(id);
}

public int getState(){
	return this.stateval;
}

public void setState(int stateval){
	this.stateval=stateval;
	update();
}

public void update(){
	for(Object o :observers){
		((ObserverIntf) o).updateState(stateval);
		((ObserverIntf) o).getState();
	}
}
}
