package VisitiorPattern;

class Client {
	public static void main(String[] args){
		VisitorConcrete vc=new VisitorConcrete();
		SubClassConcrete1 scc1=new SubClassConcrete1();
		SubClassConcrete2 scc2=new SubClassConcrete2();
		scc1.doCommonSteps();
		scc1.doUnCommonStep(vc);
		scc2.doCommonSteps();
		scc2.doUnCommonStep(vc);
		
	}
}
