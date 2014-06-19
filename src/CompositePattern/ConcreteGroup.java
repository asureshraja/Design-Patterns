package CompositePattern;

import java.util.ArrayList;

public class ConcreteGroup implements CompositeIntf {
	ArrayList<CompositeIntf> list = new ArrayList<CompositeIntf>();
	
	public void add(CompositeIntf ci){
		list.add(ci);
	}

	public void printvals() {
		for(CompositeIntf c:list)
			c.printvals();
		
	}
	
}
