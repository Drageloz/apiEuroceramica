package com.euroceramica.dashboard.domain;

public class Counters {

    private Integer co_id;
    private String co_name_counter;
    private String co_short_name;
    private String co_process_name;
    private Integer co_limit;

    public Integer getCo_id() {
        return co_id;
    }

    public void setCo_id(Integer co_id) {
        this.co_id = co_id;
    }

    public String getCo_name_counter() {
        return co_name_counter;
    }

    public void setCo_name_counter(String co_name_counter) {
        this.co_name_counter = co_name_counter;
    }

    public String getCo_short_name() {
        return co_short_name;
    }

    public void setCo_short_name(String co_short_name) {
        this.co_short_name = co_short_name;
    }

    public String getCo_process_name() {
        return co_process_name;
    }

    public void setCo_process_name(String co_process_name) {
        this.co_process_name = co_process_name;
    }

    public Integer getCo_limit() {
        return co_limit;
    }

    public void setCo_limit(Integer co_limit) {
        this.co_limit = co_limit;
    }
}
