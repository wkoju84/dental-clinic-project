package com.dental.clinic.project.controllers;

import com.dental.clinic.project.dtos.DentistDto;
import com.dental.clinic.project.services.DentistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/dentists")
public class DentistController {

    @Autowired
    DentistService service;

    @GetMapping
    public List<DentistDto> searchAllDentist(){
        List<DentistDto> list = service.searchAll();
        return list;
    }
}
