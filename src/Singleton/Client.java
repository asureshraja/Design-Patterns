package Singleton;

public class Client {

	public static void main(String[] args) {
		SingletonConcrete sc = SingletonConcrete.getSingleObject();
			sc.doSomething();
	}

}
