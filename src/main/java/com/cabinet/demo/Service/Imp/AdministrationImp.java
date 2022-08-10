package com.cabinet.demo.Service.Imp;

import com.cabinet.demo.Dto.AdministrationDto;
import com.cabinet.demo.Entity.Administration;
import com.cabinet.demo.Mapper.Mapper;
import com.cabinet.demo.Repository.AdministrationRepository;
import com.cabinet.demo.Service.AdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministrationImp implements AdministrationService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private AdministrationRepository administrationRepository;

    @Override
    public AdministrationDto save(AdministrationDto administrationDto){
        Administration administrationEntity = mapper.administrationDto2Entity(administrationDto, new Administration());
        Administration administrationSaved = administrationRepository.save(administrationEntity);
        AdministrationDto administrationDtoResult = mapper.administrationEntity2Dto(administrationSaved, new AdministrationDto());
        return administrationDtoResult;
    }


}
