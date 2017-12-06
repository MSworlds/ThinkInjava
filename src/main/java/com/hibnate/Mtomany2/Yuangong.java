package com.hibnate.Mtomany2;

import java.util.Set;

public class Yuangong {
private int deptNo;
private String name;
private Set<trans> getTrans;

	public Set<trans> getGetTrans() {
		return getTrans;
	}

	public void setGetTrans(Set<trans> getTrans) {
		this.getTrans = getTrans;
	}

	/*private Set<Bumen> bumens;
    public Set<Bumen> getBumens() {
        return bumens;
    }
    public void setBumens(Set<Bumen> bumens) {
        this.bumens = bumens;
    }*/
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}