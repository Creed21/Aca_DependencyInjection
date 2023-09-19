package aca.spring.test.DependencyInjection.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class City {

    @Id
    private Integer id;
    @Column(name = "zip_code")
    private String zipCode;
    private String name;

    public City() {
    }

    public City(Integer id, String zipCode, String name) {
        this.id = id;
        this.zipCode = zipCode;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", zipCode='" + zipCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
