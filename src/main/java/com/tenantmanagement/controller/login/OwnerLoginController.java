package com.tenantmanagement.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerLoginController {
	
	@GetMapping("/ownerLogin")
	public String ownerLogin() {
		return "OwnerLogin";
	}
	
}
