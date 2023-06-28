package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher_master")
public class Teachers {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int t_id;
	private String t_name;
	private String t_emailId;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_emailId() {
		return t_emailId;
	}

	public void setT_emailId(String t_emailId) {
		this.t_emailId = t_emailId;
	}

	@Override
	public String toString() {
		return "Teachers [t_id=" + t_id + ", t_name=" + t_name + ", t_emailId=" + t_emailId + "]";
	}

}
