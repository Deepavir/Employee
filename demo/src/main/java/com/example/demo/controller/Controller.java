package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	public String hello() {
		return "hello New World,this is new branch,second commit";
	}
}
