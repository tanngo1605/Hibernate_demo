package com.howtodoinjava.hibernate.MyHibernate;

import javax.persistence.*;

@Entity
@Table(name = "City")
public class City {
    @Id
    @Column(name = "id")
    Integer ID;

    @Column(name = "Name")
    String Name;

    @Column(name = "CountryCode")
    String CountryCode;

    @Column(name = "District")
    String District;

    @Column(name = "Population")
    Integer Population;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer iD) {
        ID = iD;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public Integer getPopulation() {
        return Population;
    }

    public void setPopulation(Integer population) {
        Population = population;
    }

}
