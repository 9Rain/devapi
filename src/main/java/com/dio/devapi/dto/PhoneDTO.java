package com.dio.devapi.dto;

import com.dio.devapi.enums.PhoneType;
import lombok.*;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@ToString
@EqualsAndHashCode
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneDTO {

    @Setter
    private Long id;

    @Setter
    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String number;

    public void setNumber(String number) {
        this.number = number.trim();
    }
}