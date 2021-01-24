package com.euroceramica.dashboard.domain;

public class Users {

    private Integer usId;
    private String usUser;
    private String usProfile;
    private String usPass;
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
