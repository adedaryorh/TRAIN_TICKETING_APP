package com.ticketbooking.book.dto;

import lombok.Data;

import java.util.List;
@Data
public class TrainDetail {

	private int id;
	private String name;
	private String number;
	private int totalCoach;
	private int totalSeatInEachCoach;
	private double seatPrice;
	private String fromLocation;
	private String toLocation;
	private List<TrainSeat> trainSeats;

	// for scheduled train
	private String scheduleTrainId; // unique ref id
	private String scheduleTime; // epochTime



}
