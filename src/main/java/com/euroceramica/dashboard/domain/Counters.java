package com.euroceramica.dashboard.domain;

public class Counters {

    private Integer coId;
    private String nameCounter;
    private String shortName;
    private String processName;
    private Integer limit;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getNameCounter() {
        return nameCounter;
    }

    public void setNameCounter(String nameCounter) {
        this.nameCounter = nameCounter;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
