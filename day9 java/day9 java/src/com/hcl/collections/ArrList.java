package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrList {
	public static void main(String[] args) { 
		List names=new ArrayList();
		names.add("jana");
		names.add("teja");
		names.add("valli");
		names.add("sneha");
		names.add("roshni");
		names.add("sainath");
		System.out.println("names are");
		for (Object object2 : names) {
			
			System.out.println(object2);
			
		} 
		names.add(2,"jana");
		System.out.println("NAMES AFTER ADDING");
		for (Object object : names) {
			System.out.println(object);
			
		}
} 
}
