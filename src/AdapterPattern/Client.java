package AdapterPattern;

public class Client {
	public static void main(String[] args){
		AdapteeConcrete aec = new AdapteeConcrete();
		AdapterConcrete arc = new AdapterConcrete(aec);
		aec.unCompatible1();
		aec.unCompatible2();
		arc.compatible1ToClient();//same output but diff interface calls. because of adaption
		arc.compatible2ToClient();
	}
}

