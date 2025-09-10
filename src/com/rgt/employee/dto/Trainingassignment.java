package com.rgt.employee.dto;

public class Trainingassignment {

	private int uid;
	private int tid;
	private String status;
	
	
	
	public Trainingassignment(int uid, int tid, String status) {
		this.uid = uid;
		this.tid = tid;
		this.status = "pending";
	}

	public int getUid() {
		return uid;
	}
	
	public int getTid() {
		return tid;
	}
	
	public String getStatus() {
		return status;
	}
	
	
	
	
}
