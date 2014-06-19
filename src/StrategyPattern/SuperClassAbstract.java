package StrategyPattern;

public abstract class SuperClassAbstract {

	public StrategyIntf strategy;
	
	public SuperClassAbstract(StrategyIntf newstrategy){
		
		this.strategy= newstrategy;
		
	}
	

	public void startPreStrategyOps(){
		
		System.out.println("Started pre strategy operations");
		
	}
	
	
	public void executeStrategy(){
		
		strategy.StategyStep1();
		strategy.StategyStep2();
		
	}
	
	
	public void startPostStrategyOps(){
		
		System.out.println("Started post strategy operations");
		
	}
	

	
}
