package com.euroceramica.dashboard.domain.dto;

import java.util.Objects;

public class Users {

    private Integer id;
    private String user;
    private String lastName;
    private String email;
    private String gender;
    private String ipAddress;

    public Users() {
    }

    public Users(Integer id, String user, String lastName, String email, String gender, String ipAddress) {
        this.id = id;
        this.user = user;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.ipAddress = ipAddress;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return Objects.equals(id, users.id) && Objects.equals(user, users.user) && Objects.equals(lastName, users.lastName) && Objects.equals(email, users.email) && Objects.equals(gender, users.gender) && Objects.equals(ipAddress, users.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, lastName, email, gender, ipAddress);
    }
}
