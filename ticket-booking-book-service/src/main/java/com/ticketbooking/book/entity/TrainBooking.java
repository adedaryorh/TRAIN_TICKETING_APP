package com.ticketbooking.book.entity;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "app_books")
@Builder
public class TrainBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_book_SEQ")
	@SequenceGenerator(name = "app_book_SEQ", sequenceName = "app_book_SEQ", allocationSize = 1)
	private int id;

	private int trainId;

	private int scheduleTrainId;

	private String bookingId;

	private int trainSeatId;

	private String trainSeat;

	private String bookingTime;

	private int userId;

	private int status;

	public TrainBooking(int id, int trainId, int scheduleTrainId, String bookingId, int trainSeatId, String trainSeat,
			String bookingTime, int userId, int status) {
		super();
		this.id = id;
		this.trainId = trainId;
		this.scheduleTrainId = scheduleTrainId;
		this.bookingId = bookingId;
		this.trainSeatId = trainSeatId;
		this.trainSeat = trainSeat;
		this.bookingTime = bookingTime;
		this.userId = userId;
		this.status = status;
	}
}
