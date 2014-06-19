package VisitiorPattern;

public abstract class SuperClassAbstract {
	public void doCommonSteps(){
		System.out.println("doing common steps");
	}
	public abstract void doUnCommonStep(VisitorIntf VisitorConcrete);
	
}
