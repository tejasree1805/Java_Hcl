package com.hcl.dept;

import java.util.Scanner;

public class SearchDeptMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		System.out.println("Enter the department number...");
		Scanner sc = new Scanner(System.in);
		int deptno=sc.nextInt();
		Dept dept = dao.searchDept(deptno);
		if(dept != null) {
			System.out.println("Department name :" +dept.getDname());
			System.out.println("City :" +dept.getCity());
		}else{
			System.out.println("Record not found");
		}
	}

}
