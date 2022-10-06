package com.demo.entity;

public class Seat {
	
	
	private int seatId;
	
	
	private int seatno;
	
	
	private int trainid;
	
	
	private String status; 
	
	
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
