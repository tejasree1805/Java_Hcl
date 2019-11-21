package com.hcl.Files;

import java.io.Serializable;

public class StudentTemplate implements Serializable { 
	int studentno;
	 String name;
	 String lastname;
	 double cgpa;
	public StudentTemplate(int studentno, String name, String lastname,
			double cgpa) {
		super();
		this.studentno = studentno;
		this.name = name;
		this.lastname = lastname;
		this.cgpa = cgpa;
	}
	public String toString() {
		return "StudentTemplate [studentno=" + studentno + ", name=" + name
				+ ", lastname=" + lastname + ", cgpa=" + cgpa + "]";
	}
}
