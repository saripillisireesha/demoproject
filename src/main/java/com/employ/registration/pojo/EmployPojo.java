package com.employ.registration.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="EMP")
public class EmployPojo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String fname;
	private String lname;
	private String email;
	private String uname;
	private String pwd;
	//private int salary;
	private String undered;
	
	

}
