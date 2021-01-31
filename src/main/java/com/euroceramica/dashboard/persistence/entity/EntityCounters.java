package com.euroceramica.dashboard.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counters")
public class EntityCounters {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "co_id")
    private Integer coId;

    @Column(name = "co_name_counter")
    private String nameCounter;

    @Column(name = "co_short_name")
    private String shortName;

    @Column(name = "co_process_name")
    private String processName;

    @Column(name = "co_limit")
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
