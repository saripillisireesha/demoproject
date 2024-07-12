package com.employ.registration.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.employ.registration.RequestDto.EmployRequest;
import com.employ.registration.ResponceDto.EmployResponse;
import com.employ.registration.constants.ApplicationConstants;
import com.employ.registration.handler.ResourceNotFoundException;
import com.employ.registration.pojo.EmployPojo;
import com.employ.registration.repository.EmployRepository;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Service
public class EmployService {
	@Autowired
	private EmployRepository employRepository;
	
	 public EmployResponse save(@RequestBody EmployRequest employRequest) {
		 EmployPojo employPojo=new EmployPojo();
				BeanUtils.copyProperties(employRequest, employPojo);
				employPojo= employRepository.save(employPojo);
				EmployResponse employResponse=new EmployResponse();
				BeanUtils.copyProperties(employPojo, employResponse);
				return employResponse;

		 }
	 public List<EmployResponse> findAll(){
		 return employRepository.findAll().stream().map(this::ConvertEntityToResponse).collect(Collectors.toList());
		 
	 }
	 public EmployPojo findById(Long id) {
		 return employRepository.findById(id).get();
	 }
	 public EmployResponse findByUnamePwd(String uname, String pwd){
		 EmployPojo employPojo=  (EmployPojo) employRepository.findByUnameAndPwd(uname,pwd)
				 .orElseThrow(() -> new ResourceNotFoundException(ApplicationConstants.Employ_Not_Found));
		return null;
	    	
	 }
	 public void deleteById(Long id) {
		 employRepository.deleteById(id);
	 }

	 public EmployResponse ConvertEntityToResponse(EmployPojo employPojo) {
		 EmployResponse employResponse=new EmployResponse();
			BeanUtils.copyProperties(employPojo, employResponse);
			return employResponse;	 
	 }


}
