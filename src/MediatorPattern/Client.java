package MediatorPattern;

public class Client {
	public static void main(String[] args){
		SubConcrete1 sc1 = new SubConcrete1();
		SubConcrete2 sc2 = new SubConcrete2();
		sc1.sendmsg(sc2, "like this msg ,msg to object btwn same class also possible");
	}
}
