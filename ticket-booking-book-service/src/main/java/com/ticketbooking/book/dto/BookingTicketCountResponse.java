package com.ticketbooking.book.dto;

import lombok.Data;

@Data
public class BookingTicketCountResponse extends CommonApiResponse {

	private int availableTicketCount;
	private int waitingTicketCount;
	private int confirmedTicketCount;

}
