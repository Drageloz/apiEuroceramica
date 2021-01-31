package com.euroceramica.dashboard.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class EntityUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "us_id")
    private Integer usId;


    @Column(name = "us_user")
    private String usUser;

    @Column(name = "us_profile")
    private String usProfile;

    @Column(name = "us_password")
    private String usPass;

    @Column(name = "us_status")
    private String usStatus;

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUsUser() {
        return usUser;
    }

    public void setUsUser(String usUser) {
        this.usUser = usUser;
    }

    public String getUsProfile() {
        return usProfile;
    }

    public void setUsProfile(String usProfile) {
        this.usProfile = usProfile;
    }

    public String getUsPass() {
        return usPass;
    }

    public void setUsPass(String usPass) {
        this.usPass = usPass;
    }

    public String getUsStatus() {
        return usStatus;
    }

    public void setUsStatus(String usStatus) {
        this.usStatus = usStatus;
    }
}
