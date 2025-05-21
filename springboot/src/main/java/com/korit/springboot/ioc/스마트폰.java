package com.korit.springboot.ioc;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    Component의 종류
    1. @Component       -> 특정 기능이 정해지지 않은 객체(나머지 객체) - filter, converter, exception
    2. @Controller      -> HTTP 요청 및 응답을 처리하는 객체
    3. @Service         -> 비지니스 로직 또는 메인로직을 정의하고 처리하는 객체
    4. @Repository      -> Database와 관련된 로직을 정의하고 처리하는 객체
    5. @Configuration   -> 설정 로직을 정의하고 처리하는 객체 또 직접 생성 후 IoC 등록을 필요로 하는 Bean 설정
 */
@Component
@AllArgsConstructor
public class 스마트폰 {

//    @Autowired
//    @Qualifier(value = "삼성배터리") // 생성자를 만들지 않고도 매개변수를 넣을 수 있는 방법
    private 삼성배터리 b;

    private BeanStudy beanStudy;

//    private 삼성배터리 b;

//    public 스마트폰(배터리 b){
//        this.b=b;
//    }

    public void 전원켜기() {
        b.전류공급();
        System.out.println("배터리로 부터 전류를 공급받아 전원을 켭니다.");
    }
}

/*
    1.
    @AllArgsConstructor
    를 사용하고 private 삼성배터리 b; 로 정확히 필요한 매개변수를 선언하는 방법

    2.
    @Autowired
    @Qualifier(value = "삼성배터리") 생성자를 만들지 않고도 매개변수를 넣을 수 있는 방법
    private 배터리 b;

    3.
    private 배터리 b;

    public 스마트폰(배터리 b){
        this.b=b;
    }
    // 각 단계별로 직접 명시
 */
