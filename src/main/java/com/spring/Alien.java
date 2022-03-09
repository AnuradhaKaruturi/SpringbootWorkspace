package com.spring;

public class Alien {
	
	private String aid;
	private String aname;
	private String alang;
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAlang() {
		return alang;
	}
	public void setAlang(String alang) {
		this.alang = alang;
	}
	
	public Alien() {
		super();
	}
	public Alien(String aid, String aname, String alang) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.alang = alang;
	}
	
	
	

}
