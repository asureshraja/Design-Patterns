package BuilderPattern;

public class Builder1Concrete implements BuilderIntf{
	ObjectConcrete oc;
	public Builder1Concrete(){
		this.oc= new ObjectConcrete();
	}
	
	public void performStep1() {
		System.out.println("perform step1");
		this.oc.step1();
	}

	public void performStep2() {
		System.out.println("perform step2");
		this.oc.step2();
	}

}
