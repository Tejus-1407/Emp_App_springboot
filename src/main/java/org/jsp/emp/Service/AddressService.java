package org.jsp.emp.Service;

import java.util.Optional;

import org.jsp.emp.Dao.AddressDao;
import org.jsp.emp.Entity.Address;
import org.jsp.emp.ResponseStructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class AddressService {
	@Autowired
	private AddressDao dao;

	public ResponseEntity<?> saveAddress(Address address) {
		
		return  ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().status(HttpStatus.CREATED.value())
				.message("Address Details saved Successfully.....!").body(dao.saveAddress(address)).build());
	}

//	public ResponseEntity<?> updateAddress(Address address) {
//		
//		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value())
//				.message("Address Details Updated Successfully............").body(dao.updateAddress(address)).build());
//	}

//	public ResponseEntity<?> findaddressById(int id) {
//		Optional<Address> optional = dao.findAddressById(id);
//		if (optional.isEmpty()) {			
//			throw InvalidAddressIdException.builder().message("Invalid Address Id...,Unable to find..!").build();
//		}
//		Address address = optional.get();
//		return ResponseEntity.status(HttpStatus.OK).body(ResponseStructure.builder().status(HttpStatus.OK.value())
//				.message("Address Id verifies Successfully............").body(address).build());
//	}
	

	
}
