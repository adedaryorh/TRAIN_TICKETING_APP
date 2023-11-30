package com.ticketbooking.book.dto;

import lombok.Data;

@Data
public class TrainSeat {

	private int id;

	private int trainId;

	private String seatNo;



	@Override
	public String toString() {
		return "TrainSeat [id=" + id +
				", trainId=" + trainId +
				", seatNo=" + seatNo + "]";
	}

}
