package org.jsp.emp.Service;

import org.jsp.emp.Dao.AddressDao;
import org.jsp.emp.Dao.EducationDao;
import org.jsp.emp.Entity.Education;
import org.jsp.emp.ResponseStructure.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class EducationService {

	@Autowired
	private EducationDao dao;
	
	
	public ResponseEntity<?> saveEducation(Education education) {
		return  ResponseEntity.status(HttpStatus.CREATED).body(ResponseStructure.builder().status(HttpStatus.CREATED.value())
				.message("Education Details saved Successfully.....!").body(dao.saveEducation(education)).build());
	}
	
//
//	public ResponseEntity<?> updateEducation(Education education) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public ResponseEntity<?> findEducationById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
