package com.employ.registration.RequestDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class EmployRequest {

		private long id;
		@NotNull(message="fname not be null")
		@NotEmpty(message="please enter fname")
		private String fname;
		@NotNull(message="lname not be null")
		@NotEmpty(message="please enter lname")

		private String lname;
		@NotNull(message="email should not be null")
		@NotEmpty(message="please enter email")

		private String email;
		@NotNull(message="uname not be null")
		@NotEmpty(message="please enter uname")

		private String uname;
		@NotNull(message="pwd should not be null")
		@NotEmpty(message="please enter pwd")

		private String pwd;
		@NotNull(message="please enter valid one not be null")

		private String undered;
	
	
	
	
	
}
