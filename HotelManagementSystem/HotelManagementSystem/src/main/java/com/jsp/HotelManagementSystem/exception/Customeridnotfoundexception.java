package com.jsp.HotelManagementSystem.exception;

public class Customeridnotfoundexception extends RuntimeException
{
	private String message="Customer ID not Found";

	@Override
	public String getMessage() 
	{
		return message;
	}

	public Customeridnotfoundexception() 
	{
		super();
	}

	public Customeridnotfoundexception(String message)
	{
		super();
		this.message = message;
	}
	
	
}
