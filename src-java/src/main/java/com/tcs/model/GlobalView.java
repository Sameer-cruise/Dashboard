package com.tcs.model;

import org.springframework.stereotype.Component;

/**
 * Created by 547885 on 11/10/2015.
 */
public class GlobalView {

    private String mel_cnt;
    private String due_date;
    private String grego;

    public String getMel_cnt() {
        return mel_cnt;
    }

    public void setMel_cnt(String mel_cnt) {
        this.mel_cnt = mel_cnt;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getGrego() {
        return grego;
    }

    public void setGrego(String grego) {
        this.grego = grego;
    }
}
