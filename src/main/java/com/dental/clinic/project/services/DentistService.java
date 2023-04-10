package com.dental.clinic.project.services;

import com.dental.clinic.project.dtos.DentistDto;
import com.dental.clinic.project.entities.Dentist;
import com.dental.clinic.project.repositories.DentistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DentistService {

    @Autowired
    private DentistRepository repository;

    public List<DentistDto> searchAll(){
        List<Dentist> list = repository.findAll();
        return list.stream().map(DentistDto::new).collect(Collectors.toList());
    }
}
