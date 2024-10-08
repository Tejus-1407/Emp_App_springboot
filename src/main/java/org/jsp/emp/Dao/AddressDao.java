package org.jsp.emp.Dao;

import java.util.Optional;

import org.jsp.emp.Entity.Address;
import org.jsp.emp.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressDao {

	@Autowired
	private AddressRepository repository;

	public Address saveAddress(Address address) {
		return repository.save(address);
	}

//	public Address updateAddress(Address address) {
//		
//		return repository.update(address);
//	}

	public Optional<Address> findAddressById(int id) {
		return repository.findById(id);
	}

}
