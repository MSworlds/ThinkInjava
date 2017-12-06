package com.hibnate.Mtomany2;

public class Bumen {
	private Integer bB_id;
	private String Bumenname;
//	private Set<Yuangong> yuangongs;
	private trans trans;

	/*public String toString() {
		return "Bumen [bB_id=" + bB_id + ", Bumenname=" + Bumenname
				+ ", yuangongs=" + yuangongs + "]";
	}

	public Set<Yuangong> getYuangongs() {
		return yuangongs;
	}*/

	/*public void setYuangongs(Set<Yuangong> yuangongs) {
		this.yuangongs = yuangongs;
	}*/

	public trans getTrans() {
		return trans;
	}

	public void setTrans(trans trans) {
		this.trans = trans;
	}

	public Integer getbB_id() {
		return bB_id;
	}

	public void setbB_id(Integer bB_id) {
		this.bB_id = bB_id;
	}

	public String getBumenname() {
		return Bumenname;
	}

	public void setBumenname(String bumenname) {
		Bumenname = bumenname;
	}
}
