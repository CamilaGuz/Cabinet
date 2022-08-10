package com.cabinet.demo.Controller;

import com.cabinet.demo.Dto.AdministrationDto;
import com.cabinet.demo.Service.AdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/administration")
public class AdministrationController {
    @Autowired
    private AdministrationService administrationService;

    @PostMapping
    public ResponseEntity<AdministrationDto> save(@RequestBody AdministrationDto administrationDto){
        AdministrationDto newAdministration = administrationService.save(administrationDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAdministration);
    }

}
