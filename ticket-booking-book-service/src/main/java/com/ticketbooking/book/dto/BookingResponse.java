package com.ticketbooking.book.dto;

import lombok.Data;

@Data
public class BookingResponse {

	// train detail
	private int trainId;
	private String trainName;
	private String trainNumber;
	private double seatPrice;
	private String fromLocation;
	private String toLocation;
	// train seat detail
	private int trainSeatId;
	private String trainSeat;
	// booking detail
	private int scheduleTrainId;
	private String scheduleTrainTime;
	private String bookingId; // unique generated booking id
	private int bookId; // primary key of Train Booking
	private int userId;
	private String status;
	private String bookingTime;
	// user detail
	private String username;
	private String mobile;


	
}
