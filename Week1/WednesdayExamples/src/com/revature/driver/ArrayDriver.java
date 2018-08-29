package com.revature.driver;

import java.util.Arrays;

public class ArrayDriver {

	public static void main(String[] args) {
		/*String strArr[] = new String[3];
		strArr[0] = "a string";
		strArr[1] = "another string";
		//strArr[2] = new ArrayDriver().addStrings(strArr[0], strArr[1]);
		//strArr[3] = "my final string";
		strArr[2] = addStrings(strArr[0], strArr[1]);
		strArr[1] = addStrings(strArr[0], strArr[1], strArr[2]);
		System.out.println(strArr[1]);
		
		for(String a : strArr){
			System.out.println(a + " from inside a for each loop");
		}
		
		System.out.println("our array has " + strArr.length + " elements");
		System.out.println("The last element in the array is " 
		+ strArr[strArr.length - 1]);*/
		String[] newArr = {"a", "b"};
		String a = "a", b = "b", c = "c", d = "d", e = "e";
		System.out.println(addStrings(a, b, c, d, e));
		System.out.println(addStrings(a, b, c, d));
		addStrings("a", newArr);
		
		Arrays.sort(newArr);
		
		String f = "Have ", g = "a nice", h="day!!!";
		System.out.println(f.concat(g.substring(1, 4).trim()).concat(h.substring(2).toUpperCase().concat(f.toLowerCase())).replace('h', 'l'));
	}
	
	public static String addStrings(String a, String b){
		return a.concat(b);
	}
	
	public static String addStrings(String a, String b, String c){
		return a.concat(b).concat(c);
	}
	//                                     VVV---- var args, or Variable Lenght Arguments     
	public static String addStrings(String a, String ... sArr){
		String ret = a;
		for(String s: sArr){
			ret.concat(s);
		}
		return ret;
	}

}
