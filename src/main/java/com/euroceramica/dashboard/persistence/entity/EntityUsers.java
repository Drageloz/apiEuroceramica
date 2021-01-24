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
    @Column(name = "usid")
    private Integer usId;


    @Column(name = "ususer")
    private String usUser;

    @Column(name = "usprofile")
    private String usProfile;

    @Column(name = "uspass")
    private String usPass;

    @Column(name = "usstatus")
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
