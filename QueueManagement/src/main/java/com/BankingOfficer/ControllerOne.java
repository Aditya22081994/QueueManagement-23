package com.BankingOfficer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerOne {
	
	@RequestMapping("/home")
	public String getHome(){
		return "HomePage.jsp";
	}

	
}
