package com.hcl.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;


public class EmployMain {
	//static ResourceBundle rb=ResourceBundle.getBundle("employ");
	public static void main(String[] args) {
		int choice ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("__________");
			System.out.println("1.Add Employ");
			System.out.println("2.Show Employ");
			System.out.println("3.Search Employ");
			System.out.println("4.write Employ");
			System.out.println("5.read Employ");
			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				addEmploy();
				break;
			case 2 :
				showEmploy();
				break;
			case 3 :
				searchEmploy();
				break;
			case 4 :
				writeEmployFile();
				break;
			case 5 :
				readEmployFile();
				break;
			default :
				System.out.println("Invalid Inputs");
			}
		
		} while (choice !=6);
		}
	public static void writeEmployFile() {
		new EmployDAO().writeEmployFileDao();
	}
	
	public static void readEmployFile() {
		new EmployDAO().readEmployFileDao();
	}
	
	public static void searchEmploy() {
		int empId;
		System.out.println("Enter Employ ID :");
		Scanner sc = new Scanner(System.in);
		empId=sc.nextInt();
		EmployDAO obj = new EmployDAO();
		Employ employ = obj.searchEmployDAO(empId);
		if(employ == null) {
			System.out.println("notfound");
			//System.out.println(rb.getString("notfound"));
		} else {
			System.out.println(employ);
		}
	}
	
	public static void showEmploy() {
		EmployDAO obj = new EmployDAO();
		List<Employ> employ = obj.showEmployDAO();
		System.out.println("Employ No      Employ Name      Department      Phone          Email           DateOfJoin    LeaveBalance      ManagerId");
		System.out.println("------------------------------------------------------------------------------------------------------------------------1");
		employ.forEach(x -> {
			System.out.println(x);
		});
	}
	public static void addEmploy() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Employ objemploy =new Employ() ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employ id");
		objemploy.setEmpId(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter employ name");
		objemploy.setEmpName(sc.nextLine());
		System.out.println("Enter employ Department");
		objemploy.setEmpDepartment(sc.nextLine());
		System.out.println("Enter employ Phone ");
		objemploy.setEmpPhone(sc.nextLine());
		System.out.println("Enter employ Email");
		objemploy.setEmpEmail(sc.nextLine());
		System.out.println("Enter  employ DateOfJoin");
		try {
			objemploy.setEmpDateOfJoin(sdf.parse(sc.nextLine()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter employ LeaveBalance");
		objemploy.setEmpLeaveBalance(sc.nextInt());
		System.out.println("Enter employ ManagerId");
		objemploy.setEmpManagerId(sc.nextInt());
		new EmployDAO().addEmployDAO(objemploy);
		System.out.println("data added..");
		//System.out.println(rb.getString("add"));
	}

}
