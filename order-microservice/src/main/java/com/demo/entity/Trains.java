package com.demo.entity;

public class Trains {
	
	
	private int trainId;
	
	
	private String trainName;
	
	
	private int sourceId;
	
	
	private int destinationId;
	
	
	private String tourMap;
	
	
	private String departureDate;
	
	
	private int seat;
	
	public Trains() {
		// TODO Auto-generated constructor stub
	}

	

	public Trains(int trainId, String trainName, int sourceId, int destinationId, String tourMap, String departureDate,
			int seat) {
		this.trainId = trainId;
		this.trainName = trainName;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.tourMap = tourMap;
		this.departureDate = departureDate;
		this.seat = seat;
	}



	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public int getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}

	public String getTourMap() {
		return tourMap;
	}

	public void setTourMap(String tourMap) {
		this.tourMap = tourMap;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}



	public int getSeat() {
		return seat;
	}



	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	

}
