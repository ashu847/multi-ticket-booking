package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SOURCEDESTINATION")
public class SourceDestination {
	
	@Id
	@Column(name="SDID")
	private int sdid;
	
	@Column(name="SDNAME")
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
