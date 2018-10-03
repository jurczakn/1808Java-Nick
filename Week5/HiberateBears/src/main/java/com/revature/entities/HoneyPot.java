package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HONEYPOT")
public class HoneyPot {

	@Id
	@Column(name="HONEYPOT_ID")
	@SequenceGenerator(name="HONEYPOTID_SEQ", sequenceName="HONEYPOTID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HONEYPOTID_SEQ")
	int honeyPotId;
	
	@Column(name="HONEYPOT_AMOUNT")
	double amount;
	
	@Column(name="VOLUME")
	double volume;

	public HoneyPot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoneyPot(int honeyPotId, double amount, double volume) {
		super();
		this.honeyPotId = honeyPotId;
		this.amount = amount;
		this.volume = volume;
	}

	public int getHoneyPotId() {
		return honeyPotId;
	}

	public void setHoneyPotId(int honeyPotId) {
		this.honeyPotId = honeyPotId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "HoneyPot [honeyPotId=" + honeyPotId + ", amount=" + amount + ", volume=" + volume + "]";
	}
	
}
