package com.revature.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="BEAR")
@NamedQueries({
	@NamedQuery(name="get_small_bears", query="FROM Bear as b WHERE b.weight < 3")
})
@Cache(region="myAwesomeCache", usage = CacheConcurrencyStrategy.READ_ONLY)
public class Bear {

	@Id
	@Column(name="BEAR_ID")
	@SequenceGenerator(name="BEARID_SEQ", sequenceName="BEARID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BEARID_SEQ")
	private int bearId;
	
	@Column(name="BEAR_COLOR")
	private String bearColor;
	
	@Column(name="BREED")
	private String bearBreed;
	
	@Column(name="HEIGHT")
	private double height;
	
	@Column(name="WEIGHT")
	private double weight;
	
	@ManyToOne
	@JoinColumn(name="BEAR_HOME")
	private Cave bearHome;
	
	@OneToOne
	@JoinColumn(name="HONEYPOT_ID")
	private HoneyPot honeyPot;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="PARENT_CUB",
				joinColumns=@JoinColumn(name="PARENT_ID"),
				inverseJoinColumns=@JoinColumn(name="CUB_ID"))
	private Set<Bear> bearCubs;
	
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bear(int bearId, String bearColor, String bearBreed, double height, double weight) {
		super();
		this.bearId = bearId;
		this.bearColor = bearColor;
		this.bearBreed = bearBreed;
		this.height = height;
		this.weight = weight;
	}

	public int getBearId() {
		return bearId;
	}

	public void setBearId(int bearId) {
		this.bearId = bearId;
	}

	public String getBearColor() {
		return bearColor;
	}

	public void setBearColor(String bearColor) {
		this.bearColor = bearColor;
	}

	public String getBearBreed() {
		return bearBreed;
	}

	public void setBearBreed(String bearBreed) {
		this.bearBreed = bearBreed;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Bear [bearId=" + bearId + ", bearColor=" + bearColor + ", bearBreed=" + bearBreed + ", height=" + height
				+ ", weight=" + weight + ", bearHomeId=" + bearHome.getCaveId() + ", honeyPot=" + honeyPot + "]";
	}

	
	
}
