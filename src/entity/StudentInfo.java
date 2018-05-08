package entity;

import java.util.Date;

public class StudentInfo {
	private int info_id;
	private String address;
	private double average_score;
	private Date date_of_birth ;
	public int getInfo_id() {
		return info_id;
	}
	public void setInfo_id(int info_id) {
		this.info_id = info_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAverage_score() {
		return average_score;
	}
	public void setAverage_score(double average_score) {
		this.average_score = average_score;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

}
