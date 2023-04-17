package com.spring1;

public class student {
   private int stId;
   private String stName;
   private String address;
   private String school;
   private String fatherName;
public int getStId() {
	return stId;
}
public void setStId(int stId) {
	this.stId = stId;
}
public String getStName() {
	return stName;
}
public void setStName(String stName) {
	this.stName = stName;  
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getschool() {
	return school;
}
public void setSchool(String school) {
	this.school=school;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
@Override
public String toString() {
	return "student [stId=" + stId + ", stName=" + stName + ", address=" + address + " ,school=" + school + " ,fatherName=" + fatherName +"]";
}
public student(int stId, String stName, String address, String school, String fatherName) {
	super();
	this.stId = stId;
	this.stName = stName;
	this.address = address;
	this.school = school;
	this.fatherName= fatherName;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
    
}
