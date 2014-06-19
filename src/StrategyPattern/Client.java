package StrategyPattern;

class Client {

	public static void main(String[] args) {
		Strategy1Concrete s1c= new Strategy1Concrete();
		Strategy2Concrete s2c= new Strategy2Concrete();
		
		SubClass1Concrete sc1c = new SubClass1Concrete(s1c);
		
		sc1c.startPreStrategyOps();
		sc1c.executeStrategy();
		sc1c.startPostStrategyOps();
		
		sc1c = new SubClass1Concrete(s2c);
		
		sc1c.startPreStrategyOps();
		sc1c.executeStrategy();
		sc1c.startPostStrategyOps();
		

	}

}
