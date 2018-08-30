package com.revature.driver;

import java.io.FileNotFoundException;
import java.util.Scanner;

import com.revature.exception.MyException;

public class ExceptionDriver {

	public static void main(String[] args){
		System.out.println("Do you want to throw an exception?");
		Scanner scan = new Scanner(System.in);
		String answer = scan.nextLine();
		//riskyCode();
		try {
			if("yes".equals(answer)){
				throw new FileNotFoundException();
			}
			System.out.println("I made it");
			recursive();
			//throw new RuntimeException();
		} /*catch (Exception e){
			System.out.println("WHAT HAVE YOU DONE!!!!!!!");
		}*/ catch (FileNotFoundException e){
			System.out.println("Inside FNF catch");
		} catch (RuntimeException e){
			System.out.println("Inside runtimeexception block");
		} catch (Error e){
			e.printStackTrace();
			System.out.println("Inside error block");
		} finally {
			System.out.println("This will always run");
		}
		//throw new Exception();
		//Object o = null;
		//o.getClass();
		System.out.println("Outside try/catch");
	}
	
	public static void riskyCode() throws MyException{
		
	}
	
	public static void recursive(){
		System.out.println("rec");
		recursive();
	}

}
