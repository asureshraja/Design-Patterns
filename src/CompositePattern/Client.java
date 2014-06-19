package CompositePattern;

public class Client {

	public static void main(String[] args) {
		ConcreteGroup ci = new ConcreteGroup();
		ConcreteGroup ci1 = new ConcreteGroup();

		ConcreteSingle cs = new ConcreteSingle("single leaf");
		ConcreteSingle cs2 = new ConcreteSingle("second leaf");
		ci.add(ci1);
		ci1.add(cs);
		ci1.add(cs2);
		ci.printvals();

	}

}
