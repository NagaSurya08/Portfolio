package com.jsp.HotelManagementSystem.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Entity
@Data
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	@NotNull(message="customer name cannot be null")
	@NotBlank(message = "customer name cannot be blank")
	private String c_name;
	@NotNull(message="customer address cannot be null")
	@NotBlank(message = "customer address cannot be blank")
	private String c_address;
	@NotNull(message="customer email cannot be null")
	@NotBlank(message = "customer email cannot be blank")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid Email")
	private String c_email;
	@NotNull(message="customer password cannot be null")
	@NotBlank(message = "customer password cannot be blank")
	@Pattern(regexp = "^(?=.*[0-9])+(?=.*[a-z])+(?=.*[A-Z])+(?=.*[@#$%^&+=])+(?=\\S+$).{6,}$", message = "min 6 characters mandatory(1 upperCase,1 lowerCase,1 specialCharacter,1 number)")
	private String c_password;
	@Min(value = 6000000000l)
	@Max(value = 9999999999l)
	private long c_phone;
	@NotNull(message="customer aadhar cannot be null")
	@NotBlank(message = "customer aadhar number cannot be blank")
	@Pattern(regexp = "[1-9][1-9]{11}", message = "Invalid Aadhar") //should give 12 numbers
	private String c_aadhar;
	
	
	public int getC_id() 
	{
		return c_id;
	}
	public void setC_id(int c_id) 
	{
		this.c_id = c_id;
	}
	public String getC_name() 
	{
		return c_name;
	}
	public void setC_name(String c_name) 
	{
		this.c_name = c_name;
	}
	public String getC_address() 
	{
		return c_address;
	}
	public void setC_address(String c_address) 
	{
		this.c_address = c_address;
	}
	public String getC_email() 
	{
		return c_email;
	}
	public void setC_email(String c_email) 
	{
		this.c_email = c_email;
	}
	public String getC_password() 
	{
		return c_password;
	}
	public void setC_password(String c_password) 
	{
		this.c_password = c_password;
	}
	public long getC_phone() 
	{
		return c_phone;
	}
	public void setC_phone(long c_phone)
	{
		this.c_phone = c_phone;
	}
	public String getC_aadhar()
	{
		return c_aadhar;
	}
	public void setC_aadhar(String c_aadhar) 
	{
		this.c_aadhar = c_aadhar;
	}
	
}
