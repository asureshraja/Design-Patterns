package VisitiorPattern;

public class SubClassConcrete1 extends SuperClassAbstract{
	public void doUnCommonStep(VisitorIntf VisitorConcrete){
		VisitorConcrete.doUnCommonStep(this);
	}
}
