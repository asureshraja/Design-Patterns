package FacadePattern;

public class Client {
	public static void main(String[] args){
		SimpleConcrete sc = new SimpleConcrete();
		sc.doConcrete1ops();
		sc.doConcrete2ops();
	}
}
