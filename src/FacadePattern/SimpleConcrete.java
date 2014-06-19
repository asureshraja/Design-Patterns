package FacadePattern;

public class SimpleConcrete {
	Abstract1 c1;
	Abstract1 c2;
	public SimpleConcrete(){
		c1 = new Concrete1();
		c2 = new Concrete2();
	}
	
	public void doConcrete1ops(){
		c1.mainSteps();
	}
	public void doConcrete2ops(){
		c2.mainSteps();
	}

}
