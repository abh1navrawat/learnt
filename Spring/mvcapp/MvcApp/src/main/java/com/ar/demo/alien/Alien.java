package com.ar.demo.alien;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
	
	@Id
	private Integer aid;
	private String aname;
	private String alang;
	
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
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
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", alang=" + alang + "]";
	}
	
}
