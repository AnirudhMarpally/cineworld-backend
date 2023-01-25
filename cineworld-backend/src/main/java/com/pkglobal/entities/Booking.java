package com.pkglobal.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="booking")
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;

    @ManyToOne
    @JoinColumn(name="showtime_fk")
    private Showtime showtime;

    @ManyToOne
    @JoinColumn(name="seat_fk")
    private MovieSeat seat;

    private String customerName;
    private String customerEmail;
    private LocalDateTime bookingDate;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public Showtime getShowtime() {
		return showtime;
	}
	public void setShowtime(Showtime showtime) {
		this.showtime = showtime;
	}
	public MovieSeat getSeat() {
		return seat;
	}
	public void setSeat(MovieSeat seat) {
		this.seat = seat;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Booking(int bookingId, Showtime showtime, MovieSeat seat, String customerName, String customerEmail,
			LocalDateTime bookingDate) {
		super();
		this.bookingId = bookingId;
		this.showtime = showtime;
		this.seat = seat;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.bookingDate = bookingDate;
	}
	public Booking() {
		super();
	}
    
    
}