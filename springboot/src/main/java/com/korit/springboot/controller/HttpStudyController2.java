package com.korit.springboot.controller;

/*
    1. 요청 URL : /api/age 응답 데이터 : { name : 염지우, age : 30} - Map
    2. 요청 URL : /api/names 응답 데이터 : ["영영","영일","영이"] - List
    3. 요청 URL : /api/students 응답 데이터 : [{name: 영일, age: 01},{name: 영이, age: 02}] - List<Map<>>
    4. 요청 URL : /api/students 응답 데이터 :
    [
        {
            name: 영영
            age: 00,
            hobby: [축구, 농구]
        },
        {
            name: 영일
            age: 01,
            hobby: [골프, 낚시]
        },
    ]
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api")
public class HttpStudyController2 {

    // 1.
    @GetMapping("/age")
    // ↓ 추가 밑 삭제 시에는 이렇게 작성합니다.
    public Map<String, String> getNA() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "염진우");
        map.put("age", "30");
        return map;
    }

    // ↓ 코드는 불변인 상황일 때 사용(즉, 추가를 더 하지 않는다는 가정 하에 작성
//    public Map<String, Object> getNa() {
//        Map<String, Object> map = Map.of("name", "염진우","age", "30");
//        return map;
//    }

    // 2.
    @GetMapping("/names")
    // ↓ 코드도 위와 같이 불변일 때는 List.of() 가능
    public List<String> getNs() {
        List<String> li = new ArrayList<>();
        li.add("영영");
        li.add("영일");
        li.add("영이");
        return li;
    }
    /*
        다른 방법
        1. List.of("영영","영일","영이");
        2. String[] name = {"영영","영일","영이"};
     */

    // 3.
    @GetMapping("/students")
    public List<Map<String, String>> getSs() {
        List<Map<String, String>> li = new ArrayList<>();
        Map<String, String> m1 = new HashMap<>();
        Map<String, String> m2 = new HashMap<>();
        m1.put("name","영영");
        m1.put("age","00");
        m2.put("name","영일");
        m2.put("age","01");
        li.add(m1);
        li.add(m2);
        return li;
    }

    // 4.
    @GetMapping("/students2")
    public List<Map<String, Object>> getSs2() {
        List<Map<String, Object>> li = new ArrayList<>();
        Map<String, Object> m1 = new HashMap<>();
        Map<String, Object> m2 = new HashMap<>();

        m1.put("name","영영");
        m1.put("age", "00");
        m1.put("hobby",List.of("축구","농구"));
        li.add(m1);

        m2.put("name","영일");
        m2.put("age","01");
        m2.put("hobby",List.of("골프","낚시"));
        li.add(m2);

        return li;
    }
}