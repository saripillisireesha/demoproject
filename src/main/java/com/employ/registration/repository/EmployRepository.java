package com.employ.registration.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employ.registration.RequestDto.EmployRequest;
import com.employ.registration.pojo.EmployPojo;

@Repository
public interface EmployRepository extends JpaRepository<EmployPojo, Long> {

	 public Optional<?> findByUnameAndPwd(String uname, String pwd);
	


}
