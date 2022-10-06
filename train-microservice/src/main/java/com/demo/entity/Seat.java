package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SEAT")
public class Seat {
	
	@Id
	@Column(name="SEATID")
	private int seatId;
	
	@Column(name="SEATNO")
	private int seatno;
	
	@Column(name="TRAINID")
	private int trainid;
	
	@Column(name="STATUS")
	private String status; 
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BOOKINGID", referencedColumnName = "BOOKINGID")
	private TrainBook bookTrain;
	
	public Seat() {
		// TODO Auto-generated constructor stub
	}

	

	public Seat(int seatId, int seatno, int trainid, String status) {
		this.seatId = seatId;
		this.seatno = seatno;
		this.trainid = trainid;
		this.status = status;
	}



	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}

	public int getTrainid() {
		return trainid;
	}

	public void setTrainid(int trainid) {
		this.trainid = trainid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSeatId() {
		return seatId;
	}

	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}



	public TrainBook getBookTrain() {
		return bookTrain;
	}



	public void setBookTrain(TrainBook bookTrain) {
		this.bookTrain = bookTrain;
	}
	
	
	

}
