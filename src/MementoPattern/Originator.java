package MementoPattern;

public class Originator {

	String m;
	public void setState(String state){
		this.m= state; 
	}
	public Memento saveAsMemento(){
		return (new Memento(this.m)); 
	}
	
}
