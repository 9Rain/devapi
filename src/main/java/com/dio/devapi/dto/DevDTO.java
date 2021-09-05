package com.dio.devapi.dto;

import lombok.*;
import org.hibernate.validator.constraints.URL;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@ToString
@EqualsAndHashCode
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DevDTO {
    
    @Setter
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @Setter
    @NotEmpty
    @CPF
    private String cpf;

    @Setter
    @NotNull
    private String birthDate;

    @Setter
    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @URL
    private String linkedin;

    @NotEmpty
    @URL
    private String github;

    @Setter
    @Valid
    @NotEmpty
    private List<PhoneDTO> phones;

    
    public void setFirstName(String firstName) {
        this.firstName = firstName.trim();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin.trim();
    }

    public void setGithub(String github) {
        this.github = github.trim();
    }
}