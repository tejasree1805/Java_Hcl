package com.hcl.Files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {
	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:/files/d.txt");
			DataOutputStream dout=new DataOutputStream(fout);
			dout.writeInt(67);
			dout.writeInt(56);
			dout.close();
			fout.close();
			System.out.println("hfftjukiioi8s");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
