package com.bikkadIt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GENDER_DTLS")
public class Gender {
	@Id
	@Column(name="GENDER_ID")
	private int genderId;
	@Column(name="GENDER_NAME")
	private String gender;
	public int getGenderId() {
		return genderId;
	}
	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}
	public String getGender() {
		return gender;
	}
	public void setGenderName(String genderName) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Genders [genderId=" + genderId + ", genderName=" + gender + "]";
	}
	

}
