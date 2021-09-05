package com.dio.devapi.util;

import com.dio.devapi.dto.DevDTO;
import com.dio.devapi.model.Dev;

import java.time.LocalDate;
import java.util.Collections;

public class DevUtil {

    private static final String FIRST_NAME = "Junior";
    private static final String LAST_NAME = "Mota";
    private static final String CPF_NUMBER = "067.756.900-96";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1997, 1, 1);
    public static final String EMAIL = "junior@example.com";
    public static final String LINKEDIN = "https://linkedin.com";
    public static final String GITHUB = "https://github.com";

    public static DevDTO createFakeDTO() {
        return DevDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("01-01-1997")
                .email(EMAIL)
                .linkedin(LINKEDIN)
                .github(GITHUB)
                .phones(Collections.singletonList(PhoneUtil.createFakeDTO()))
                .build();
    }

    public static Dev createFakeEntity() {
        return Dev.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .email(EMAIL)
                .linkedin(LINKEDIN)
                .github(GITHUB)
                .phones(Collections.singletonList(PhoneUtil.createFakeEntity()))
                .build();
    }
}