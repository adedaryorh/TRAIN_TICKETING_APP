package com.ticketbooking.book.dto;

import lombok.Data;

@Data
public class BookTrainRequestDto {

	private int scheduleTrainId;

	private int userId;

	private int trainSeatId;

	private int totalSeat;

}
