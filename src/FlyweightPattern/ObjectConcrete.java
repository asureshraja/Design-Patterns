package FlyweightPattern;

public class ObjectConcrete implements ObjectIntf{
	int x;
	public ObjectConcrete(int x){
		this.x=x;
	}
	
	public void getparam(int x) {
		
		System.out.println("the value is "+x);
	}

}
