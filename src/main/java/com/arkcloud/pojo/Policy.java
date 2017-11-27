package com.arkcloud.pojo;

import java.util.Date;

public class Policy {
    private Integer id;

    private String name;

    private String desc;

    private Byte fullbkType;

    private Date fullbkDaytime;

    private Byte fullbkWeekday;

    private Byte fullbkWhichweek;

    private Byte incrbkType;

    private Integer incrPeriod;

    private Date incrDaytime;

    private Byte diffbkType;

    private Byte diffbkMode;

    private Date diffbkDaytime;

    private Byte diffbkWeekday;

    private Byte bkWindowType;

    private Date bkWindowStartat;

    private Date bkWindowFinishat;

    private Boolean healthCheckType;

    private Date healthCkeckDaytime;

    private Byte healthCkeckWeekday;

    private Byte retryTimes;

    private Integer retryInterval;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public Byte getFullbkType() {
        return fullbkType;
    }

    public void setFullbkType(Byte fullbkType) {
        this.fullbkType = fullbkType;
    }

    public Date getFullbkDaytime() {
        return fullbkDaytime;
    }

    public void setFullbkDaytime(Date fullbkDaytime) {
        this.fullbkDaytime = fullbkDaytime;
    }

    public Byte getFullbkWeekday() {
        return fullbkWeekday;
    }

    public void setFullbkWeekday(Byte fullbkWeekday) {
        this.fullbkWeekday = fullbkWeekday;
    }

    public Byte getFullbkWhichweek() {
        return fullbkWhichweek;
    }

    public void setFullbkWhichweek(Byte fullbkWhichweek) {
        this.fullbkWhichweek = fullbkWhichweek;
    }

    public Byte getIncrbkType() {
        return incrbkType;
    }

    public void setIncrbkType(Byte incrbkType) {
        this.incrbkType = incrbkType;
    }

    public Integer getIncrPeriod() {
        return incrPeriod;
    }

    public void setIncrPeriod(Integer incrPeriod) {
        this.incrPeriod = incrPeriod;
    }

    public Date getIncrDaytime() {
        return incrDaytime;
    }

    public void setIncrDaytime(Date incrDaytime) {
        this.incrDaytime = incrDaytime;
    }

    public Byte getDiffbkType() {
        return diffbkType;
    }

    public void setDiffbkType(Byte diffbkType) {
        this.diffbkType = diffbkType;
    }

    public Byte getDiffbkMode() {
        return diffbkMode;
    }

    public void setDiffbkMode(Byte diffbkMode) {
        this.diffbkMode = diffbkMode;
    }

    public Date getDiffbkDaytime() {
        return diffbkDaytime;
    }

    public void setDiffbkDaytime(Date diffbkDaytime) {
        this.diffbkDaytime = diffbkDaytime;
    }

    public Byte getDiffbkWeekday() {
        return diffbkWeekday;
    }

    public void setDiffbkWeekday(Byte diffbkWeekday) {
        this.diffbkWeekday = diffbkWeekday;
    }

    public Byte getBkWindowType() {
        return bkWindowType;
    }

    public void setBkWindowType(Byte bkWindowType) {
        this.bkWindowType = bkWindowType;
    }

    public Date getBkWindowStartat() {
        return bkWindowStartat;
    }

    public void setBkWindowStartat(Date bkWindowStartat) {
        this.bkWindowStartat = bkWindowStartat;
    }

    public Date getBkWindowFinishat() {
        return bkWindowFinishat;
    }

    public void setBkWindowFinishat(Date bkWindowFinishat) {
        this.bkWindowFinishat = bkWindowFinishat;
    }

    public Boolean getHealthCheckType() {
        return healthCheckType;
    }

    public void setHealthCheckType(Boolean healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    public Date getHealthCkeckDaytime() {
        return healthCkeckDaytime;
    }

    public void setHealthCkeckDaytime(Date healthCkeckDaytime) {
        this.healthCkeckDaytime = healthCkeckDaytime;
    }

    public Byte getHealthCkeckWeekday() {
        return healthCkeckWeekday;
    }

    public void setHealthCkeckWeekday(Byte healthCkeckWeekday) {
        this.healthCkeckWeekday = healthCkeckWeekday;
    }

    public Byte getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Byte retryTimes) {
        this.retryTimes = retryTimes;
    }

    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }
}