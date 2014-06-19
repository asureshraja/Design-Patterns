package CommandPattern;
import java.util.*;
public class InvokerConcrete {
	ArrayList<CommandIntf> cmds = new ArrayList<CommandIntf>();
	public void storeAndExecute(CommandIntf c){
		c.execute();
		cmds.add(c);
	}
	public void rollback(){
		
		cmds.remove(cmds.size()-1);
		cmds.get(cmds.size()-1).execute();
	}
}
