package com.hcl.Files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input1 {
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER NAME");
		try {
			String name=br.readLine();
			System.out.println("name is " +name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
