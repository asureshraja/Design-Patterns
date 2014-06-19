package MediatorPattern;

public class Mediator {
	public static void showMessage(SuperAbstract sa,SuperAbstract sb, String msg){
		System.out.println(sa+" sent to "+sb+": "+msg);
	}
}
