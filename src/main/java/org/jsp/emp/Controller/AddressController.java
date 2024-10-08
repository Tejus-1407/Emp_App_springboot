package org.jsp.emp.Controller;

import org.jsp.emp.Entity.Address;
import org.jsp.emp.Entity.Employee;
import org.jsp.emp.Service.AddressService;
import org.jsp.emp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Address")
public class AddressController {


	@Autowired
	private AddressService service;
	
	@PostMapping
	public ResponseEntity<?> saveEducation(@RequestBody Address address) 
	{
		return service.saveAddress(address);
	}
	
//	@PutMapping
//	public ResponseEntity<?> updateEmployee(@RequestBody Address address) 
//	{
//		return service.updateAddress(address);
//	}
	
//	@GetMapping("/{id}")
//	public ResponseEntity<?> findAddressById(@PathVariable int id)
//	{
//
//		return service.findaddressById(id);
//	}
}
