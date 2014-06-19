package BridgePattern;

public class Client {
	public static void main(String[] args){
		BridgeIntf i1=new Implementer1();
		BridgeIntf i2=new Implementer2();
		SubConcrete1 sc1= new SubConcrete1(i1);
		sc1.performOperation();
		SubConcrete1 sc2= new SubConcrete1(i2);
		sc2.performOperation();
	}
}
