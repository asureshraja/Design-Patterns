package MementoPattern;
import java.util.*;
public class CareTaker {
	

	ArrayList mementos = new ArrayList();

	public void saveMemento(Memento m){
		mementos.add(m);
	}
	
	public Memento getMemento(int index){
		return ((Memento)mementos.get(index));
	}
	
	
}

