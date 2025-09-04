package com.rgt.employee.dto;

import java.time.LocalDate;

public class Training {

	private int tid;
	private String title;
	private LocalDate duedate;
	private String status;
	
	public Training(String title, LocalDate duedate, String status) {
		this.title = title;
		this.duedate = duedate;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
