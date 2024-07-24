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

import com.jsp.HotelManagementSystem.dto.Admin;
import com.jsp.HotelManagementSystem.dto.Booking;
import com.jsp.HotelManagementSystem.service.Adminservice;
import com.jsp.HotelManagementSystem.util.Responsestructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/admin")
public class Admincontroller 
{
	@Autowired
	private Adminservice adminservice;

	@ApiOperation(value = "save admin", notes = "api is used to save admin")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "admin succesfully created"),@ApiResponse(code = 404, message = "admin not saved give proper input")})
	@PostMapping
	public ResponseEntity<Responsestructure<Admin>> saveAdmin(@Valid @RequestBody Admin admin, @RequestParam int hid)
	{
		return adminservice.saveAdmin(admin, hid);

	}

	@ApiOperation(value = "update admin", notes = "api is used to update admin")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "admin succesfully updated"),@ApiResponse(code = 404, message = "admin not updated give proper input")})
	@PutMapping
	public ResponseEntity<Responsestructure<Admin>> updateAdmin(@Valid @RequestBody Admin admin, @RequestParam int aid)
	{
		return adminservice.updateAdmin(aid, admin);

	}

	@ApiOperation(value = "delete admin", notes = "api is used to delete admin")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "admin succesfully delete"),@ApiResponse(code = 404, message = "admin not deleted give proper input")})
	@DeleteMapping
	public ResponseEntity<Responsestructure<Admin>> deleteAdmin(@Valid @RequestParam int aid)
	{
		return adminservice.deleteAdmin(aid);

	}

	@ApiOperation(value = "get admin by id", notes = "api is used to get admin details based on id")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "succesfully found admin"),@ApiResponse(code = 404, message = "admin not found give proper input")})
	@GetMapping("/adminbyid")
	public ResponseEntity<Responsestructure<Admin>> getAdminbyid(@Valid @RequestParam int aid) 
	{
		return adminservice.getAdminbyid(aid);

	}

	@ApiOperation(value = "get admin by email", notes = "api is used to get admin details based on email")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "succesfully found admin"),@ApiResponse(code = 404, message = "admin not found give proper input")})
	@GetMapping("/adminbyemail")
	public ResponseEntity<Responsestructure<Admin>> getAdminbyemail(@Valid @RequestParam String email) 
	{
		return adminservice.getadminbyemail(email);

	}

	@ApiOperation(value = "get all admins", notes = "api is used to get all admins")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "succesfully found admins"),@ApiResponse(code = 404, message = "admins not found give proper input")})
	@GetMapping("/getalladmin")
	public ResponseEntity<Responsestructure<List<Admin>>> getallAdmin()
	{
		return adminservice.getallAdmin();
	}

	@ApiOperation(value = "login admin", notes = "api is used to login admin")
	@ApiResponses(value = {@ApiResponse(code = 302, message = "succesfully login admin"),@ApiResponse(code = 404, message = "admin not found give proper input")})
	@GetMapping("/loginadmin")
	public ResponseEntity<Responsestructure<Admin>> loginAdmin(@Valid @RequestParam String email, @RequestParam String password) 
	{
		return adminservice.loginAdmin(email, password);

	}
}
