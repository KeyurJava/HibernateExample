package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Master")
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int s_id;
	private String s_name;
	private String s_emailId;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_emailId() {
		return s_emailId;
	}

	public void setS_emailId(String s_emailId) {
		this.s_emailId = s_emailId;
	}

	@Override
	public String toString() {
		return "Students [s_id=" + s_id + ", s_name=" + s_name + ", s_emailId=" + s_emailId + "]";
	}

}
