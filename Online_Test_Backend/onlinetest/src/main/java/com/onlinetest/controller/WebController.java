package com.onlinetest.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {
	
	
	@GetMapping("/")
    public String index() {
        return "index.html"; 
    }
	
	@GetMapping("/newUserCreation")
    public String user() {
        return "Usermaster.html"; 
    }
	
	@GetMapping("/newCategoryCreation")
    public String category() {
        return "Categorymaster.html"; 
    }
	
	@GetMapping("/newTopicCreation")
    public String topic() {
        return "TopicMaster.html"; 
    }
	
	@GetMapping("/newQuestionCreation")
    public String question() {
        return "QuestionMaster.html"; 
    }
	
}
