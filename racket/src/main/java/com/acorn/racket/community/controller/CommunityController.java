package com.acorn.racket.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CommunityController {

	@GetMapping("/test")
	public String writeview() {
		
		return "CommunityWriter";
	}
}
