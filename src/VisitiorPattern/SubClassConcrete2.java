package VisitiorPattern;

public class SubClassConcrete2 extends SuperClassAbstract{
	public void doUnCommonStep(VisitorIntf VisitorConcrete){
		VisitorConcrete.doUnCommonStep(this);
	}
}
