package com.hcl.dept;

import java.util.List;

public class CreateDeptMain {
	
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		List<Dept> deptlist = dao.showdept();
		for (Dept dept : deptlist) {
			System.out.println("Dept no :" +dept.getDeptno());
			System.out.println("Dept Name : " +dept.getDname());
			System.out.println("Location  :" +dept.getLoc());
			System.out.println("City : " +dept.getCity());
			System.out.println("Head od Dept : " +dept.getHead());
			System.out.println("______________________________\n");
		}
	}

}
