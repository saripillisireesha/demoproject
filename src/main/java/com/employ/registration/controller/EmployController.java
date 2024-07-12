package com.employ.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employ.registration.RequestDto.EmployRequest;
import com.employ.registration.ResponceDto.EmployResponse;
import com.employ.registration.pojo.EmployPojo;
import com.employ.registration.service.EmployService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmployController {
	@Autowired
	private EmployService employService;
	    @PostMapping
	public String create( @Valid @RequestBody EmployRequest employRequest) {
		 employService.save(employRequest);
		 return "registered sucsessfully";
	}
	    @GetMapping
	    public List<EmployResponse> findAll() {
	    	return employService.findAll();
	    }
	    @GetMapping("/{id}")
	    public String findById( @PathVariable Long id) {
	    	 employService.findById(id);
	    	 return "login successfully";
	    }
	    @GetMapping("/uname/{uname}/{pwd}")
	    public  EmployResponse findByUnamePwd( @PathVariable String uname, @PathVariable String pwd) {
	    	return employService.findByUnamePwd(uname,pwd);
	    }
	   @DeleteMapping("/id/{id}")
	   public String deleteById(@PathVariable Long id) {
		   employService.deleteById(id);
		   return "deleted Successfully";
	   }
	   @PutMapping
	   public String UpdateEmploy(@RequestBody EmployRequest employRequest) {
		   employService.save(employRequest);
		   return "update Sucsessfully";
	   }
	    
	 
	    

}
