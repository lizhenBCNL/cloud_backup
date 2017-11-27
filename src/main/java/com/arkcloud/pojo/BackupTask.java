package com.arkcloud.pojo;

import java.util.Date;

public class BackupTask {
    private Integer id;

    private String name;

    private Byte type;

    private Integer jobId;

    private Date createdAt;

    private Date updatedAt;

    private Date finishedAt;

    private Integer srcInfoId;

    private Integer destInfoId;

    private String status;

    private String desc;

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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Integer getSrcInfoId() {
        return srcInfoId;
    }

    public void setSrcInfoId(Integer srcInfoId) {
        this.srcInfoId = srcInfoId;
    }

    public Integer getDestInfoId() {
        return destInfoId;
    }

    public void setDestInfoId(Integer destInfoId) {
        this.destInfoId = destInfoId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}