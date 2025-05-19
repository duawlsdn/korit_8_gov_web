package com.korit.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @RestController 사용 시 @ResponseBody 생략 가능
@RequestMapping("/api")
public class HttpStudyController {

    @GetMapping("/http")
    //@ResponseBody   // 응답시 데이터로 응답
    public String get() {
        return "Spring boot http";
    }

    @GetMapping("/name")
    public String getName() {
        return "염진우";
    }


}
