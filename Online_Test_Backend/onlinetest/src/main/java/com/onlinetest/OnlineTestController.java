package com.onlinetest;
import org.springframework.web.bind.annotation.RestController;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam; 

@RestController
public class OnlineTestController {
	
	@GetMapping("/hello")  
	public String hello()   
	{  
	return "Hello User, have a nice day.";  
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestParam(name = "name") String name, @RequestParam(name = "password") String password,@RequestParam(name = "mail") String mail,@RequestParam(name = "phone") String phone,@RequestParam(name = "gender") String gender) { 
	    return "Name: " + name + " Phone: " + phone;
	}

}
