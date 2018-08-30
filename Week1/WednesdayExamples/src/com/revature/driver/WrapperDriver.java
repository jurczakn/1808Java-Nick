package com.revature.driver;

public class WrapperDriver {

	public static void main(String[] args) {
		Byte b = new Byte((byte)5);
		Boolean boo = new Boolean(true);
		Character c = new Character('c');
		Short s = new Short((short)4);
		Integer i = new Integer(10);
		Long l = new Long(6L);
		Double d = new Double(5.6);
		Float f = new Float(0.0f);
		
		System.out.println(add(5, 6));
		
		int a = add(i, 7);
		
		Integer z = a + c + 17;
		
	}
	
	public static Integer add(Integer i, Integer i2){
		return i + i;
	}

}
