package com.telsuko.Hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
// @Table(name = "Student_table")
public class Student { // POJO
	@Id
	private int rollno;
	private FLMname aname;
	private int marks;
	private String grade;
	// @OneToOne
	// private Laptop laptop;

	@OneToMany(mappedBy = "student")
	private List<Laptop> laptop = new ArrayList<Laptop>();

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", aname=" + aname + ", marks=" + marks + ", grade=" + grade + "]";
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public FLMname getAname() {
		return aname;
	}

	public void setAname(FLMname aname) {
		this.aname = aname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}
