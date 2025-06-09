package com.korit.springboot.domain.dto;

import com.korit.springboot.domain.Entity.DoctorEntity;
import lombok.Data;

@Data
public class DoctorRegisterDto {
    private String doctorName;
    private String department;

//    public DoctorEntity toEntity() {
//        return DoctorEntity.builder()
//                .doctorName(doctorName)
//                .build();
//    }

    public DoctorEntity toEntity(Integer departmentId) {
        return DoctorEntity.builder()
                .doctorName(doctorName)
                .departmentId(departmentId)
                .build();
    }
}
