package com.shoopfloor.item;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Item {
	@Id
	private String ppid;
	private String rma;
	private String pn;
	private String lot;
	private String descp;
	private String problemCode;
	private String dps;
	private String userId;
	private String time;

	public Item() {}


	public Item(String ppid, String rma, String pn, String lot, String descp, String problemCode, String dps,
			String userId, String time) {
		super();
		this.ppid = ppid;
		this.rma = rma;
		this.pn = pn;
		this.lot = lot;
		this.descp = descp;
		this.problemCode = problemCode;
		this.dps = dps;
		this.userId = userId;
		this.time = time;
	}
	
	

	public String getPpid() {
		return ppid;
	}


	public void setPpid(String ppid) {
		this.ppid = ppid;
	}


	public String getRma() {
		return rma;
	}


	public void setRma(String rma) {
		this.rma = rma;
	}


	public String getPn() {
		return pn;
	}


	public void setPn(String pn) {
		this.pn = pn;
	}


	public String getLot() {
		return lot;
	}


	public void setLot(String lot) {
		this.lot = lot;
	}


	public String getDescp() {
		return descp;
	}


	public void setDescp(String descp) {
		this.descp = descp;
	}


	public String getProblemCode() {
		return problemCode;
	}


	public void setProblemCode(String problemCode) {
		this.problemCode = problemCode;
	}


	public String getDps() {
		return dps;
	}


	public void setDps(String dps) {
		this.dps = dps;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "Item [ppid=" + ppid + ", rma=" + rma + ", pn=" + pn + ", lot=" + lot + ", descp=" + descp
				+ ", problemCode=" + problemCode + ", dps=" + dps + ", userId=" + userId + ", time=" + time + "]";
	}
	



}