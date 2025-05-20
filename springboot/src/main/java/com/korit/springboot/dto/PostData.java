package com.korit.springboot.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@ToString
//@Setter // Json 에서 자동으로 변환되게 해줌으로 인해서 라이브러리 사용 시 필요
//@Getter
@Data
public class PostData {
    private String name;
    private Integer age;
    private Address address;
}
