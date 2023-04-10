package com.dental.clinic.project.dtos;

import com.dental.clinic.project.entities.Dentist;

public class DentistDto {

    private Integer id;
    private String name;

    private String email;
    private Integer cro;
    private boolean meetsCovenant;

    public DentistDto() {
    }

    public DentistDto(Integer id, String name, String email, Integer cro, boolean meetsCovenant) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cro = cro;
        this.meetsCovenant = meetsCovenant;
    }

    public DentistDto(Dentist dentist) {
        this.id = dentist.getId();
        this.name = dentist.getName();
        this.email = dentist.getEmail();
        this.cro = dentist.getCro();
        this.meetsCovenant = dentist.isMeetsCovenant();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCro() {
        return cro;
    }

    public void setCro(Integer cro) {
        this.cro = cro;
    }

    public boolean isMeetsCovenant() {
        return meetsCovenant;
    }

    public void setMeetsCovenant(boolean meetsCovenant) {
        this.meetsCovenant = meetsCovenant;
    }
}
