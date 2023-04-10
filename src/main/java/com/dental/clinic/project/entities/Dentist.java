package com.dental.clinic.project.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private String email;
    private Integer cro;
    private boolean meetsCovenant;

    public Dentist() {
    }

    public Dentist(Integer id, String name, String email, Integer cro, boolean meetsCovenant) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cro = cro;
        this.meetsCovenant = meetsCovenant;
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
