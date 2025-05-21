package com.korit.springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/*
    REST API
    요청과 응답
    REST - 웹상의 자원을 이름으로 구분하고 해당 자원의 상태를 주고 받는 모든 것
    RESTful - REST를 기반으로 만들어진 API, REST 원칙을 잘 지킨 서비스 API, REST 원리를 잘 따르는 시스템은 RESTful 하다고 표현

    참고 사이트 :
    - https://m.blog.naver.com/codingbarbie/223233477242
    - https://hahahoho5915.tistory.com/54

    HTTP 응답 상태 코드
    - 400번대 -> 클라이언트 실수
    - 500번대 -> 백엔드 실수


    응답 관련 정보 - ResponseEntity
 */

@RestController
public class HttpStudyController4 {

    @GetMapping("/api/study/http/get")
    public ResponseEntity<Map<String, Object>> get() {
//        return new ResponseEntity<>(Map.of("name", "염진우","age",32), HttpStatus.BAD_REQUEST);
        return ResponseEntity.badRequest().body(Map.of("name", "염진우","age",32));
    }
}