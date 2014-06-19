package Singleton;

public class SingletonConcrete {
private static SingletonConcrete instance = new SingletonConcrete();
private SingletonConcrete(){}
public static SingletonConcrete getSingleObject(){
	return instance;
}
public void doSomething(){
	System.out.println("do something");
}
}
