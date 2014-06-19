package MediatorPattern;

public abstract class SuperAbstract {
	public void sendmsg(SuperAbstract sb,String msg){
		Mediator.showMessage(this,sb,msg);
		
	}
}
