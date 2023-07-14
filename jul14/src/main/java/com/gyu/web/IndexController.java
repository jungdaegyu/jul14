package com.gyu.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	@GetMapping("/") //첫 페이지 시작했을때 web/ 라고 들어왔을땡 <-대규야 이거기엽다
	public String index() {
		return "index";
	}

	
	
	
	
	
	
}
