package BridgePattern;

public class SubConcrete1 extends AbstractorAbstract{

	public SubConcrete1(BridgeIntf bi) {
		super(bi);
	}
	void performOperation(){
		bi.doOperation();
	}

}
