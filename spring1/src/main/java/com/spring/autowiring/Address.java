package com.spring.autowiring;

public class Address {
      private int h_no;
      private String city;
      private String  state;
	public Address(int h_no, String city, String state) {
		super();
		this.h_no = h_no;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getH_no() {
		return h_no;
	}
	public void setH_no(int h_no) {
		this.h_no = h_no;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [h_no=" + h_no + ", city=" + city + ", state=" + state + "]";
	}
      
      
      
}
