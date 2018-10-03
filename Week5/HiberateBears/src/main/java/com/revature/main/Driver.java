package com.revature.main;

import java.util.Scanner;

import org.hibernate.Session;

import com.revature.entities.HoneyPot;
import com.revature.util.SessionUtil;

public class Driver {

	public static void main(String[] args) {
		Session sess = SessionUtil.getSession();
		System.out.println("Please enter ID: ");
		Scanner scan = new Scanner(System.in);
		int id = Integer.parseInt(scan.nextLine());
		System.out.println(sess.get(HoneyPot.class, id));

	}

}
