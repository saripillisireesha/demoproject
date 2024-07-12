package com.employ.registration.ResponceDto;

import com.employ.registration.RequestDto.EmployRequest;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Data
public class EmployResponse {
			private long id;
			private String fname;
			private String lname;
			private String email;
			private String uname;
			//private String pwd;
			private String undered;
}
