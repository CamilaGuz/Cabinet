package com.cabinet.demo.Dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdministrationDto {

    private String id;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    //private Date dateOfBirth;
    private int dni;

}
