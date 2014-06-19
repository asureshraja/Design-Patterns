package VisitiorPattern;

public class VisitorConcrete implements VisitorIntf{

	public void doUnCommonStep(SubClassConcrete2 subClassConcrete2) {
		System.out.println("this is from Concretesubclass2");
		
	}

	public void doUnCommonStep(SubClassConcrete1 subClassConcrete1) {
		System.out.println("this is from Concretesubclass1");
		
	}

}
