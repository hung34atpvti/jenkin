package com.cmc.jenkin.entity;

import javax.persistence.*;

import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;
    @Column
    private String address;
    @Column
    private String country;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "address")
    private Set<User> users;

    public Address() {
    }

    public Address(Long id, String address, String country, Set<User> users) {
        this.id = id;
        this.address = address;
        this.country = country;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
