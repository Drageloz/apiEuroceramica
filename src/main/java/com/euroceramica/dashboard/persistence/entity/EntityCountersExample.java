package com.euroceramica.dashboard.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "counterexample")
public class EntityCountersExample {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ce_id")
    private Integer ceId;

    @Column(name="ce_value")
    private Integer ceValue;

    public Integer getCeId() {
        return ceId;
    }

    public void setCeId(Integer ceId) {
        this.ceId = ceId;
    }

    public Integer getCeValue() {
        return ceValue;
    }

    public void setCeValue(Integer ceValue) {
        this.ceValue = ceValue;
    }
}
