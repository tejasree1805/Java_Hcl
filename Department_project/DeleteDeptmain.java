package com.hcl.dept;

import java.util.Scanner;

public class DeleteDeptmain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		System.out.println("Enter department number:");
		Scanner sc = new Scanner(System.in);
		int deptno = sc.nextInt();
		System.out.println(dao.deleteDept(deptno));
	}

}
