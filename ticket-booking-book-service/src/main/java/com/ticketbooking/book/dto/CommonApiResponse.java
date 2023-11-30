package com.ticketbooking.book.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import lombok.Builder;
@Data
@Builder
public class CommonApiResponse {

	private String responseMessage;
	private HttpStatus status;
	private boolean isSuccess;

	public CommonApiResponse(String responseMessage, HttpStatus status, boolean isSuccess) {
		super();
		this.responseMessage = responseMessage;
		this.status = status;
		this.isSuccess = isSuccess;
	}
	
	public CommonApiResponse() {
		super();
	}

}
