package com.telsuko.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class FLMname {
private String Fname;
private String Lname;
private String Mname;
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getMname() {
	return Mname;
}
public void setMname(String mname) {
	Mname = mname;
}

}
