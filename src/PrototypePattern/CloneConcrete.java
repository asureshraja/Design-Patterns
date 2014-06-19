package PrototypePattern;

public class CloneConcrete implements CloneIntf{

	public CloneConcrete(){
		System.out.println("object cooked");
	}
	public CloneIntf makeCopy() {
		CloneConcrete temp=null;
		try {
			temp= (CloneConcrete)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return temp;
	}
	
}
