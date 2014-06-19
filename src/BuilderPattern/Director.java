package BuilderPattern;

public class Director {
	public BuilderIntf b1;
	public Director(BuilderIntf bi){
		this.b1=bi;
	}
public void builtit(){
	b1.performStep1();
	b1.performStep2();
}
}

