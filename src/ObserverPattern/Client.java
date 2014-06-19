package ObserverPattern;

public class Client {

	public static void main(String[] args) {
		SubjectConcrete sc=new SubjectConcrete();
		Observer1Concrete o1c=new Observer1Concrete(sc);
		Observer2Concrete o2c=new Observer2Concrete(sc);
		Observer3Concrete o3c=new Observer3Concrete(sc);
		sc.setState(1);
		sc.setState(3);
		
	}

}
