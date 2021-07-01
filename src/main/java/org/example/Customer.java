package org.example;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    private String name;

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", country_of_birth='" + country_of_birth + '\'' +
                ", country_of_residence='" + country_of_residence + '\'' +
                ", segment='" + segment + '\'' +
                '}';
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country_of_birth;
    private String country_of_residence;
    private String segment;

    public Customer() {
    }

    public Customer(String name, Long id, String country_of_birth, String country_of_residence, String segment) {
        this.name = name;
        this.id = id;
        this.country_of_birth = country_of_birth;
        this.country_of_residence = country_of_residence;
        this.segment = segment;
    }

    public Customer(String name, String country_of_birth, String country_of_residence, String segment) {
        this.name = name;
        this.country_of_birth = country_of_birth;
        this.country_of_residence = country_of_residence;
        this.segment = segment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long  getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry_of_birth() {
        return country_of_birth;
    }

    public void setCountry_of_birth(String country_of_birth) {
        this.country_of_birth = country_of_birth;
    }

    public String getCountry_of_residence() {
        return country_of_residence;
    }

    public void setCountry_of_residence(String country_of_residence) {
        this.country_of_residence = country_of_residence;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }
}
