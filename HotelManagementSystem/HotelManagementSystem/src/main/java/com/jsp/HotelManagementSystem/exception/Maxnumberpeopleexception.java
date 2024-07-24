package com.jsp.HotelManagementSystem.exception;

public class Maxnumberpeopleexception extends RuntimeException
{
	private String message="We can't have these many number of people in the selected room";

	@Override
	public String getMessage()
	{
		return message;
	}

	public Maxnumberpeopleexception()
	{
		super();
	}

	public Maxnumberpeopleexception(String message)
	{
		super();
		this.message = message;
	}
	
	
}
