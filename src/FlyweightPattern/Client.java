package FlyweightPattern;

public class Client {
	public static void main(String args[]){
		ObjectFactory of = new ObjectFactory();
		of.createObject(1);
		of.createObject(2);
		of.createObject(2);
		of.createObject(2);
		of.createObject(2);
		of.createObject(2);
		of.createObject(2);
	}
}
