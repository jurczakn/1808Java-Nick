package com.revature.pojos;

import java.io.Serializable;
import java.time.LocalDateTime;
//									vvvvv-------Marker Interface
public class Assignment implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6583439374517835765L;

	private LocalDateTime dueDate;
	
	private double grade;
	
	private String instructions;
	
	private String question;
	
	private String answer;
	
	private transient String studentSSN;

	public String getStudentSSN() {
		return studentSSN;
	}

	public void setStudentSSN(String studentSSN) {
		this.studentSSN = studentSSN;
	}

	public LocalDateTime getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Assignment [dueDate=" + dueDate + ", grade=" + grade + ", instructions=" + instructions + ", question="
				+ question + ", answer=" + answer + ", studentSSN=" + studentSSN + "]";
	}
	
}
