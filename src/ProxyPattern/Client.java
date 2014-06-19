package ProxyPattern;

public class Client {
	public static void main(String[] args){
		ProxyConcrete pc=new ProxyConcrete();
		pc.doOperation();
	}
}
