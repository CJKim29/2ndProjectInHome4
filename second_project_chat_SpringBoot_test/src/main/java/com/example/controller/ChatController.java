package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

	 @RequestMapping("/chatting")
	    public String chat() {
	        return "chatting/chatting"; 
	    }
}
