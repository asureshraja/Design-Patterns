package CompositePattern;

public class ConcreteSingle implements CompositeIntf{
	String val;
	public ConcreteSingle(String val){
		this.val=val;
	}

	public void printvals() {
		System.out.println(this.val);
	}
}
