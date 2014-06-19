package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		FactoryProducer fp = new FactoryProducer();
		fp.produceFactory("firstcat").createFactory1("Concrete1").doOperations();

	}

}
