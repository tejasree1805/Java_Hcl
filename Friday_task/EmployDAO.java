package com.hcl.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class EmployDAO {
	static List<Employ> lstemploy = null;
	//static ResourceBundle rb = null;
	static {
		lstemploy = new ArrayList<Employ>();
		//rb = ResourceBundle.getBundle("employ");
	}
	public void readEmployFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/files/employ.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstemploy =(List<Employ>)objin.readObject();
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void writeEmployFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/files/employ.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject( lstemploy);
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String addEmployDAO(Employ employ) {
		lstemploy.add(employ);
		//return rb.getString("add");
		return "data added";
	}
	public List<Employ> showEmployDAO() {
		return lstemploy;
	}
	public Employ searchEmployDAO(int empId) {
		Employ objemploy = null;
		for (Employ employ : lstemploy) {
			if(employ.getEmpId() == empId) {
				objemploy = employ;
			} 
		}
		return objemploy;
	}

}
