package com.hcl.Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foutput {
	public static void main(String[] args) {
		try {
			FileInputStream src=new FileInputStream("C:/day9 java/day9 java/src/com/hcl/Files/Files.java");
			FileOutputStream tar=new FileOutputStream("C:/files/cpy.txt",true);
			int ch;
			while((ch=src.read()) != -1) {
				tar.write((char)ch);
			}
			src.close();tar.close();
			System.out.println("File copied");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
