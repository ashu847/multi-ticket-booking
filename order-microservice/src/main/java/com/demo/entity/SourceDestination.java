package com.demo.entity;

public class SourceDestination {
	
	
	private int sdid;
	
	
	private String sdname;
	
	public SourceDestination() {
		// TODO Auto-generated constructor stub
	}

	public SourceDestination(int sdid, String sdname) {
		this.sdid = sdid;
		this.sdname = sdname;
	}

	public int getSdid() {
		return sdid;
	}

	public void setSdid(int sdid) {
		this.sdid = sdid;
	}

	public String getSdname() {
		return sdname;
	}

	public void setSdname(String sdname) {
		this.sdname = sdname;
	}

	
	

}
