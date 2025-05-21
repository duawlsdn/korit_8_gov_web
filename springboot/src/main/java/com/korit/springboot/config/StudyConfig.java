package com.korit.springboot.config;

import com.korit.springboot.ioc.BeanStudy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    @Configuration
    - 설정 파일이란 큰 틀에 속함
    - 함수의 명이 컴포넌트 명이 된다.
    - @Bean 등록시 자동 실행
        - @Bean은 한 개 이상 등록 가능

    * 직접 정의한 클래스는 @Component 제시, 외부 라이브러리에 속한 클래스를 등록 할 때는 @Bean을 명시
 */

@Configuration
public class StudyConfig {

    @Bean
    public BeanStudy bean1() {
        System.out.println("bean 생성");
        return new BeanStudy();
    }

//    @Bean
//    public Criteria criteria() {
//        return new Criteria();
//    }
}
