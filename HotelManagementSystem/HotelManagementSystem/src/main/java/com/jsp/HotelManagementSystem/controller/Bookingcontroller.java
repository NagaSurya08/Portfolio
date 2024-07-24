package com.jsp.HotelManagementSystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.HotelManagementSystem.dto.Booking;
import com.jsp.HotelManagementSystem.dto.Customer;
import com.jsp.HotelManagementSystem.service.Bookingservice;
import com.jsp.HotelManagementSystem.util.Responsestructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/booking")
public class Bookingcontroller 
{
	@Autowired
	private Bookingservice bookingservice;

	@ApiOperation(value = "save booking", notes = "api is used to save booking")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "booking succesfully created"),@ApiResponse(code = 404, message = "booking not saved give proper input")})
	@PostMapping
	public ResponseEntity<Responsestructure<Booking>> saveBooking(@Valid @RequestBody Booking booking, @RequestParam int cid, @RequestParam int rid)
	{
		return bookingservice.saveBooking(booking, cid, rid);
	}

	@ApiOperation(value = "update booking", notes = "api is used to update booking")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "booking succesfully updated"),@ApiResponse(code = 404, message = "booking not updated give proper input")})
	@PutMapping
	public ResponseEntity<Responsestructure<Booking>> updateBooking(@Valid @RequestBody Booking booking, @RequestParam int bid)
	{
		return bookingservice.updateBooking(booking, bid);

	}

	@ApiOperation(value = "delete booking", notes = "api is used to delete booking")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "booking succesfully delete"),@ApiResponse(code = 404, message = "booking not deleted give proper input")})
	@DeleteMapping
	public ResponseEntity<Responsestructure<Booking>> deleteBooking(@Valid @RequestParam int bid) 
	{
		return bookingservice.deleteBooking(bid);

	}

	@ApiOperation(value = "get booking by id", notes = "api is used to get booking details based on id")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "succesfully found booking"),@ApiResponse(code = 404, message = "booking not found give proper input")})
	@GetMapping("/bookingbyid")
	public ResponseEntity<Responsestructure<Booking>> getBookingbyid(@Valid @RequestParam int bid)
	{
		return bookingservice.getBookingbyid(bid);

	}


	@ApiOperation(value = "get all bookings", notes = "api is used to get all bookings details")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "succesfully found bookings"),@ApiResponse(code = 404, message = "bookings not found give proper input")})
	@GetMapping("/getallbooking")
	public ResponseEntity<Responsestructure<List<Booking>>> getallBookings()
	{
		return bookingservice.getallBookings();
	}

	@ApiOperation(value = "close booking", notes = "api is used to close booking")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "booking succesfully closed"),@ApiResponse(code = 404, message = "booking not found give proper input")})
	@PutMapping("/closebooking")
	public ResponseEntity<Responsestructure<Booking>> closeBooking(@Valid @RequestParam int bid)
	{
		return bookingservice.closeBooking(bid);

	}
}
