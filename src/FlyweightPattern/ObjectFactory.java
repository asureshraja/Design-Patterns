package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ObjectFactory {
	private static final HashMap<Integer,ObjectIntf> map = new HashMap();
	public ObjectIntf createObject(int val){
		
		if(this.map.get(val)==null){
			System.out.println("new");
			ObjectConcrete temp=new ObjectConcrete(val);
			map.put(val,temp);
			return temp;
		}
		else
		{
		System.out.println("old");
		return this.map.get(val);
		}
	}
}
