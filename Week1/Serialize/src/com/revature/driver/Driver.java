package com.revature.driver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import com.revature.pojos.Assignment;

public class Driver {

	private static final String filename = "myAssignment.dat";

	public static void main(String[] args) {
		Assignment assignment = new Assignment();
		assignment.setDueDate(LocalDateTime.now().plusDays(1));
		assignment.setGrade(.90);
		assignment.setInstructions("Do some programming");
		assignment.setQuestion("Can a constructor be overloaded?");
		assignment.setAnswer("U betcha");
		assignment.setStudentSSN("123");
		System.out.println(assignment);

		/*
		 * FileOutputStream fout = null; ObjectOutputStream oos = null;
		 * 
		 * try { fout = new FileOutputStream(filename); oos = new
		 * ObjectOutputStream(fout); oos.writeObject(assignment); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } finally{ try { oos.close(); }
		 * catch (IOException e) { e.printStackTrace(); } }
		 */

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(assignment);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			Assignment newAssignment = (Assignment) ois.readObject();
			System.out.println(newAssignment);
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

}
