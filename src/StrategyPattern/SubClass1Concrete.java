package StrategyPattern;

public class SubClass1Concrete extends SuperClassAbstract{

	public SubClass1Concrete(StrategyIntf newstrategy) {
		super(newstrategy);
	}
	
	public void startPostStrategyOps(){
		
		System.out.println("Started post strategy operations.\n End");
		
	}
	
}
