package com.rgt.employee.dto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Training {

	private int tid;
	private String title;
	private LocalDate duedate;
	private  Map<Integer,String> mapstatus = new HashMap<>();
	
	
	public Training(String title, LocalDate duedate, Map<Integer, String> mapstatus) {
		this.title = title;
		this.duedate = duedate;
		this.mapstatus = mapstatus;
	}
	public Training() {
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDuedate() {
		return duedate;
	}
	public void setDuedate(LocalDate duedate) {
		this.duedate = duedate;
	}
	public Map<Integer, String> getMapstatus() {
		return mapstatus;
	}
	public void assignTraining(int uid2) {

		this.mapstatus.put(uid2,"pending");
	}

	
	
}
