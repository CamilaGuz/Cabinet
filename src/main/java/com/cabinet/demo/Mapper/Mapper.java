package com.cabinet.demo.Mapper;

import com.cabinet.demo.Dto.AdministrationDto;
import com.cabinet.demo.Entity.Administration;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    public static Administration administrationDto2Entity(AdministrationDto dto, Administration administration){
        administration.setName(dto.getName());
        administration.setLastName(dto.getLastName());
        administration.setEmail(dto.getEmail());
        administration.setDni(dto.getDni());
        administration.setPhone(dto.getPhone());
       // administration.setDateOfBirth(dto.getDateOfBirth());
        return administration;
    }

    public static AdministrationDto administrationEntity2Dto(Administration administration, AdministrationDto dto){
        dto.setId(administration.getId());
        dto.setName(administration.getName());
        dto.setLastName(administration.getLastName());
        dto.setEmail(administration.getEmail());
        dto.setDni(administration.getDni());
        dto.setPhone(administration.getPhone());
        //dto.setDateOfBirth(administration.getDateOfBirth());
        return dto;
    }
}
