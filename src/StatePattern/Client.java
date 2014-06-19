package StatePattern;

public class Client {
	public static void main(String[] args){
		ContextConcrete cc=new ContextConcrete();
		State2Concrete s2c=new State2Concrete();
		s2c.doStateActions(cc);
		State1Concrete s1c=new State1Concrete();
		s1c.doStateActions(cc);
		s2c=new State2Concrete();
		s2c.doStateActions(cc);
		
	}
}
