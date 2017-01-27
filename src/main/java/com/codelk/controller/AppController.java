package com.codelk.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {

	@RequestMapping("/")
	public String index(){
		return "index";
	}

	@MessageMapping("/pub")
	public String processMessage(String message){
		return message.toUpperCase();
	}
}
