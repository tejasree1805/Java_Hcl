package com.hcl.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String deleteDept(int deptno) {
		connection = DaoConnection.getconnection();
		Dept dept = searchDept(deptno);
		String result ="";
		if(dept != null) {
			System.out.println("Dept no :" +dept.getDeptno());
			System.out.println("Dept Name : " +dept.getDname());
			System.out.println("Location  :" +dept.getLoc());
			System.out.println("City : " +dept.getCity());
			System.out.println("Head od Dept : " +dept.getHead());
			System.out.println("______________________________\n");
			
			String cmd = " delete from Department where deptno = ? ";
			try {
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, deptno);
				pst.executeUpdate();
				result = "record deleted...";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("Record not fopund...");
		}
		return result;
	}
	
	public Dept searchDept(int deptno) {
		connection = DaoConnection.getconnection();
		String cmd = " select * from department where deptno = ? ";
		Dept dept = null;
		try {
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, deptno);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				dept = new Dept();
				dept.setDname(rs.getString("Dname"));
				dept.setLoc(rs.getString("Loc"));
				dept.setCity(rs.getString("city"));
				dept.setHead(rs.getString("head"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dept;
	}
	
	public String adddept(Dept dept) {
		connection = DaoConnection.getconnection();
		String cmd = " insert into Department(Deptno,Dname,Loc,City,Head) " +
						" values(?,?,?,?,?) ";
		String result = "";
		try {
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, dept.getDeptno());
			pst.setString(2, dept.getDname());
			pst.setString(3, dept.getLoc());
			pst.setString(4, dept.getCity());
			pst.setString(5, dept.getHead());
			pst.executeUpdate();
			result = "Department added successfully..";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public List<Dept> showdept() {
		connection = DaoConnection.getconnection();
		String cmd = " select * from Department ";
		Dept dept = null;
		List<Dept> deptlist = new ArrayList<Dept>();
		try {
			pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				dept = new Dept();
				dept.setDeptno(rs.getInt("Deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("Loc"));
				dept.setCity(rs.getString("city"));
				dept.setHead(rs.getString("head"));
				deptlist.add(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptlist;
		
	}
	
	public int getDeptNo() {
		connection = DaoConnection.getconnection();
		String cmd = " select case when max(deptno) is null then 1 " +
				 " else max(deptno)+1 end deptno from department" ;
		int deptno = 0;
		try {
			pst = connection.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			deptno = rs.getInt("deptno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptno;
	}

}
