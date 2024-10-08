package org.jsp.emp.Dao;

import java.util.Optional;

import org.jsp.emp.Entity.Address;
import org.jsp.emp.Entity.Education;
import org.jsp.emp.repository.AddressRepository;
import org.jsp.emp.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EducationDao {

	@Autowired
	private EducationRepository repository;

	public Education saveEducation(Education education) {
		return repository.save(education);
	}

//	public Address updateAddress(Address address) {
//		
//		return repository.update(address);
//	}

	public Optional<Education> findAddressById(int id) {
		return repository.findById(id);
	}
}
