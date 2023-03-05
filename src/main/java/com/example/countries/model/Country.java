package com.example.countries.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table
public class Country {

    @Id
    @GeneratedValue( strategy = IDENTITY )
    private Long id;
    private String name;
    private String capital;
    private String region;
    private String subRegion;
    private String area;

    public Country() {
    }

    public Country( Long id, String name, String capital, String region, String subRegion, String area ) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subRegion = subRegion;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital( String capital ) {
        this.capital = capital;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion( String region ) {
        this.region = region;
    }

    public String getSubRegion() {
        return subRegion;
    }

    public void setSubRegion( String subRegion ) {
        this.subRegion = subRegion;
    }

    public String getArea() {
        return area;
    }

    public void setArea( String area ) {
        this.area = area;
    }
}
