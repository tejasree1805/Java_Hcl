package com.hcl.dept;

import java.util.Scanner;

public class AddDeptMain {
	
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		//System.out.println("New Department No:\n");
		//System.out.println(dao.getDeptNo());
		
		Dept dept = new Dept();
		int deptno = dao.getDeptNo();
		dept.setDeptno(deptno);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Department name :");
		dept.setDname(sc.nextLine());
		System.out.println("Enter Location :");
		dept.setLoc(sc.nextLine());
		System.out.println("Enter City");
		dept.setCity(sc.nextLine());
		System.out.println("Enter Head of Dept");
		dept.setHead(sc.nextLine());
		System.out.println(dao.adddept(dept));
	}
}
