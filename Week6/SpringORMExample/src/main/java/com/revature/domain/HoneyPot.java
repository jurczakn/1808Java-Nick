package com.revature.domain;

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
	@Column(name="honeypot_id")
	@SequenceGenerator(name="honeypotid_seq", sequenceName="honeypotid_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="honeypotid_seq")
	private Integer honeypotId;
	
	@Column(name="honeypot_amount")
	private Double honeypotAmount;
	
	@Column(name="volume")
	private Double volume;

	public Integer getHoneypotId() {
		return honeypotId;
	}

	public void setHoneypotId(Integer honeypotId) {
		this.honeypotId = honeypotId;
	}

	public Double getHoneypotAmount() {
		return honeypotAmount;
	}

	public void setHoneypotAmount(Double honeypotAmount) {
		this.honeypotAmount = honeypotAmount;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public HoneyPot(Integer honeypotId, Double honeypotAmount, Double volume) {
		super();
		this.honeypotId = honeypotId;
		this.honeypotAmount = honeypotAmount;
		this.volume = volume;
	}

	public HoneyPot() {
		super();
	}

	@Override
	public String toString() {
		return "HoneyPot [honeypotId=" + honeypotId + ", honeypotAmount=" + honeypotAmount + ", volume=" + volume + "]";
	}

}
