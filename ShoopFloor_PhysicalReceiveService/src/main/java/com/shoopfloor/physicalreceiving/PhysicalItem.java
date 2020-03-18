package com.shoopfloor.physicalreceiving;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PhysicalItem {
	@Id
	private String ppid;
	private String rma;
	private String pn;
	private String sn;
	private String mac;
	private String cpu_sn;
	private String revision;
	private String mPN;
	private String lot;
	private String descp;
	private String problemCode;
	private String dps;
	private String userId;
	private String time;
	
	
	public PhysicalItem() {

	}


	public PhysicalItem(String ppid, String rma, String pn, String sn, String mac, String cpu_sn, String revision, String mPN,
			String lot, String descp, String problemCode, String dps, String userId, String time) {
		super();
		this.ppid = ppid;
		this.rma = rma;
		this.pn = pn;
		this.sn = sn;
		this.mac = mac;
		this.cpu_sn = cpu_sn;
		this.revision = revision;
		this.mPN = mPN;
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
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getCpu_sn() {
		return cpu_sn;
	}
	public void setCpu_sn(String cpu_sn) {
		this.cpu_sn = cpu_sn;
	}
	public String getRevision() {
		return revision;
	}
	public void setRevision(String revision) {
		this.revision = revision;
	}
	public String getmPN() {
		return mPN;
	}
	public void setmPN(String mPN) {
		this.mPN = mPN;
	}
	public String getLot() {
		return lot;
	}
	public void setLot(String lot) {
		this.lot = lot;
	}
	public String getdescp() {
		return descp;
	}
	public void setdescp(String descp) {
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
		return "Item [ppid=" + ppid + ", rma=" + rma + ", pn=" + pn + ", sn=" + sn + ", mac=" + mac + ", cpu_sn=" + cpu_sn
				+ ", revision=" + revision + ", mPN=" + mPN + ", lot=" + lot + ", descp=" + descp + ", problemCode="
				+ problemCode + ", dps=" + dps + ", userId=" + userId + ", time=" + time + "]";
	}
}
