package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // controlller annotation(컨트롤러 선언)
public class FirstController {
    @GetMapping("/hi") // http://localhost:8080/hi로 요청이 들어오면
    public String niceToMeetYou(Model model) { // model 객체를 매개변수로 받음
        // model 객체가 "박서연" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "seoyeon Park");
        return "greetings"; // greetings.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("username", "seoyeon Park");
        return "goodbye";
    }
}
