package AdapterPattern;

public class AdapterConcrete implements TargetIntf{
	AdapteeConcrete a;
	public AdapterConcrete(AdapteeConcrete a){
		this.a=a;
	}

	public void compatible1ToClient() {
		a.unCompatible1();
		
	}
	public void compatible2ToClient() {
		a.unCompatible2();
		
	}

}
