package com.revature.driver;

import java.lang.reflect.Field;

public class ReflectionDriver {

	public static void main(String[] args) {
		String s = "String Class";
		System.out.println("Old value: " + s);
		Class<String> stringClass = String.class;
	
		try{
			Field value = stringClass.getDeclaredField("value");
			value.setAccessible(true);
			value.set(s, "new value".toCharArray());
			System.out.println("New value: " + s);
			System.out.println("String Class");
			String s2 = new String("String Class");
			System.out.println(s2);
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
}
