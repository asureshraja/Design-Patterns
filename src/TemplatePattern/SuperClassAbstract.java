package TemplatePattern;

public abstract class SuperClassAbstract {
abstract void step1();
abstract void step2();
abstract void step3();
public void step4(){
	System.out.println("performing common step4");
}

public final void algorithmAllSteps(){
	step1();
	step2();
	step3();
	step4();
}

}

