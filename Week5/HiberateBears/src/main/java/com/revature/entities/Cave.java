package com.revature.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CAVE")
public class Cave {

	@Id
	@Column(name="CAVE_ID")
	@SequenceGenerator(name="CAVEID_SEQ", sequenceName="CAVEID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CAVEID_SEQ")
	private int caveId;
	
	@Column(name="CAVE_TYPE")
	private String caveType;
	
	@Column(name="SQ_FOOTAGE")
	private double sqFootage;

	public Cave(int caveId, String caveType, double sqFootage) {
		super();
		this.caveId = caveId;
		this.caveType = caveType;
		this.sqFootage = sqFootage;
	}

	@OneToMany(mappedBy="bearHome", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Set<Bear> residents = new HashSet<Bear>();
	
	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCaveId() {
		return caveId;
	}

	public void setCaveId(int caveId) {
		this.caveId = caveId;
	}

	public String getCaveType() {
		return caveType;
	}

	public void setCaveType(String caveType) {
		this.caveType = caveType;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public Set<Bear> getResidents() {
		return residents;
	}

	public void setResidents(Set<Bear> residents) {
		this.residents = residents;
	}

	@Override
	public String toString() {
		return "Cave [caveId=" + caveId + ", caveType=" + caveType + ", sqFootage=" + sqFootage + ", residents="
				+ residents + "]";
	}

	
	
}
