package PrototypePattern;

public class Client {
	public static void main(String[] args){
		CloneFactory cf= new CloneFactory();
		CloneConcrete cc = new CloneConcrete();
		System.out.println(cc.hashCode());
		System.out.println(cf.create(cc).hashCode());
	}
}
