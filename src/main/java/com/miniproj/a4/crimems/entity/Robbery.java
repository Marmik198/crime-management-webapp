package com.miniproj.a4.crimems.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "robbery")
public class Robbery {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String first_name;
	
	@Column(name = "last_name")
	private String last_name;
	
	@Column(name ="Age")
	private String age;
	
	@Column(name ="Date_of_incident")
	private String date;
	
	@Column(name ="Time_of_incident")
	private String time;
	
	@Column(name ="Amount_Robbed")
	private String amt;
	
	@Column(name = "Description")
	private String desc;

	@Column(name = "Status")
	private int status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Robbery [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", age=" + age
				+ ", date=" + date + ", time=" + time + ", amt=" + amt + ", desc=" + desc + "]";
	}

	
	

}
