package PrototypePattern;

public class CloneFactory {
	public CloneIntf create(CloneIntf ci){
		return ci.makeCopy();
	}
}
