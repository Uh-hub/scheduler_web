package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("test")

public class TestController {
	
	@GetMapping
	public String testController() {
		return "Hello World!(안녕하세요!)";
	}
	@GetMapping("/{id}")
	public String testControllerWithPathVariables(@PathVariable(value="id")int id) {//여기 코드 500 internal error 나서 이걸로 변경함P.82
		return "Hello World! ID "+ id;
	}
	
	@GetMapping("/Param")
	public String testControllerRequestParam(@RequestParam(value="id")int id) {
		return "Hello World! ID param "+id;
	}
}