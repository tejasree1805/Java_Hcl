package com.hcl.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FInput {
	public static void main(String[] args) {
		try {
			FileInputStream fin=new FileInputStream("C:/day9 java/day9 java/src/com/hcl/Files/Files.java");
			int ch;
			while((ch=fin.read()) != -1){
				System.out.print((char)ch);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
