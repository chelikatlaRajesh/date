package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.configur;
@RestController
public class controlle {

	
//	@Autowired  //com.example.demo.configur
//	private configur config;
	
	@GetMapping("security")
	public String data() {
		return "hi this from conroller";
	}

}
