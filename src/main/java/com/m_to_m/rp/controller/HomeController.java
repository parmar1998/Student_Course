package com.m_to_m.rp.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/loggedInUser")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
}
