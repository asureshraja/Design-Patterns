package BuilderPattern;

public class Client {
	public static void main(String[] args){
		BuilderIntf b1 = new Builder1Concrete();
		Director d=new Director(b1);
		d.builtit();
			
	}
}
