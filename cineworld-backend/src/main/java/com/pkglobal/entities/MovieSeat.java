package com.pkglobal.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="movieseat")
@AllArgsConstructor
@NoArgsConstructor
public class MovieSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seatNumber;
    private String rowNumber;
    private boolean booked;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getRowNumber() {
		return rowNumber;
	}
	public void setRowNumber(String rowNumber) {
		this.rowNumber = rowNumber;
	}
	public boolean isBooked() {
		return booked;
	}
	public void setBooked(boolean booked) {
		this.booked = booked;
	}
	public MovieSeat(Long id, String seatNumber, String rowNumber, boolean booked) {
		super();
		this.id = id;
		this.seatNumber = seatNumber;
		this.rowNumber = rowNumber;
		this.booked = booked;
	}
	public MovieSeat() {
		super();
	}
    
    
    
    
}