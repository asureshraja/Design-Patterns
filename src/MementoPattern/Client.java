package MementoPattern;

public class Client {
public static void main(String[] args){
	Originator o = new Originator();
	CareTaker ct = new CareTaker();
	o.setState("state1");
	ct.saveMemento(o.saveAsMemento());
	o.setState("state2");
	ct.saveMemento(o.saveAsMemento());
	System.out.println(ct.getMemento(0));
	System.out.println(ct.getMemento(1));
	
}
}
