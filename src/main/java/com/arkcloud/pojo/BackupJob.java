package com.arkcloud.pojo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BackupJob {
    private Integer id;

    private String name;

    private Date createdAt;

    private Date startedAt;

    private Date updatedAt;

    private Date finishedAt;

    private Byte type;

    private Integer srcId;

    private Integer primaryDestId;

    private Integer secondaryDestId;

    private Integer policyId;

    private Integer objectsNum;

    private Date lastRuntime;

    private Date nextRuntime;

    private Date incrLastRuntime;

    private Byte status;

    private Boolean excludeSwapfiles;

    private Boolean enableVmwaretools;

    private Boolean enabledCbt;

    private Boolean enableDedup;

    private Boolean enableAppAwareness;

    private Boolean enableEncryption;

    private String encryptionPwd;

    private Byte compressLevel;

    private Integer successNum;

    private Integer warningNum;

    private Integer errorNum;

    private String ntfContents;

    private Byte ntfType;

    private String platform;

    private String tag;

    private String jobDesc;

    private Boolean enableIncrbk;

    private Boolean enableDiffbk;

    private Boolean enableRetry;

    private Date lastRetryTime;

    private Boolean enableBackupWindow;

    private Boolean enableHealthCheck;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getSrcId() {
        return srcId;
    }

    public void setSrcId(Integer srcId) {
        this.srcId = srcId;
    }

    public Integer getPrimaryDestId() {
        return primaryDestId;
    }

    public void setPrimaryDestId(Integer primaryDestId) {
        this.primaryDestId = primaryDestId;
    }

    public Integer getSecondaryDestId() {
        return secondaryDestId;
    }

    public void setSecondaryDestId(Integer secondaryDestId) {
        this.secondaryDestId = secondaryDestId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Integer getObjectsNum() {
        return objectsNum;
    }

    public void setObjectsNum(Integer objectsNum) {
        this.objectsNum = objectsNum;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getLastRuntime() {
        return lastRuntime;
    }

    public void setLastRuntime(Date lastRuntime) {
        this.lastRuntime = lastRuntime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getNextRuntime() {
        return nextRuntime;
    }

    public void setNextRuntime(Date nextRuntime) {
        this.nextRuntime = nextRuntime;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getIncrLastRuntime() {
        return incrLastRuntime;
    }

    public void setIncrLastRuntime(Date incrLastRuntime) {
        this.incrLastRuntime = incrLastRuntime;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Boolean getExcludeSwapfiles() {
        return excludeSwapfiles;
    }

    public void setExcludeSwapfiles(Boolean excludeSwapfiles) {
        this.excludeSwapfiles = excludeSwapfiles;
    }

    public Boolean getEnableVmwaretools() {
        return enableVmwaretools;
    }

    public void setEnableVmwaretools(Boolean enableVmwaretools) {
        this.enableVmwaretools = enableVmwaretools;
    }

    public Boolean getEnabledCbt() {
        return enabledCbt;
    }

    public void setEnabledCbt(Boolean enabledCbt) {
        this.enabledCbt = enabledCbt;
    }

    public Boolean getEnableDedup() {
        return enableDedup;
    }

    public void setEnableDedup(Boolean enableDedup) {
        this.enableDedup = enableDedup;
    }

    public Boolean getEnableAppAwareness() {
        return enableAppAwareness;
    }

    public void setEnableAppAwareness(Boolean enableAppAwareness) {
        this.enableAppAwareness = enableAppAwareness;
    }

    public Boolean getEnableEncryption() {
        return enableEncryption;
    }

    public void setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
    }

    public String getEncryptionPwd() {
        return encryptionPwd;
    }

    public void setEncryptionPwd(String encryptionPwd) {
        this.encryptionPwd = encryptionPwd == null ? null : encryptionPwd.trim();
    }

    public Byte getCompressLevel() {
        return compressLevel;
    }

    public void setCompressLevel(Byte compressLevel) {
        this.compressLevel = compressLevel;
    }

    public Integer getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Integer successNum) {
        this.successNum = successNum;
    }

    public Integer getWarningNum() {
        return warningNum;
    }

    public void setWarningNum(Integer warningNum) {
        this.warningNum = warningNum;
    }

    public Integer getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(Integer errorNum) {
        this.errorNum = errorNum;
    }

    public String getNtfContents() {
        return ntfContents;
    }

    public void setNtfContents(String ntfContents) {
        this.ntfContents = ntfContents == null ? null : ntfContents.trim();
    }

    public Byte getNtfType() {
        return ntfType;
    }

    public void setNtfType(Byte ntfType) {
        this.ntfType = ntfType;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public Boolean getEnableIncrbk() {
        return enableIncrbk;
    }

    public void setEnableIncrbk(Boolean enableIncrbk) {
        this.enableIncrbk = enableIncrbk;
    }

    public Boolean getEnableDiffbk() {
        return enableDiffbk;
    }

    public void setEnableDiffbk(Boolean enableDiffbk) {
        this.enableDiffbk = enableDiffbk;
    }

    public Boolean getEnableRetry() {
        return enableRetry;
    }

    public void setEnableRetry(Boolean enableRetry) {
        this.enableRetry = enableRetry;
    }
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getLastRetryTime() {
        return lastRetryTime;
    }

    public void setLastRetryTime(Date lastRetryTime) {
        this.lastRetryTime = lastRetryTime;
    }

    public Boolean getEnableBackupWindow() {
        return enableBackupWindow;
    }

    public void setEnableBackupWindow(Boolean enableBackupWindow) {
        this.enableBackupWindow = enableBackupWindow;
    }

    public Boolean getEnableHealthCheck() {
        return enableHealthCheck;
    }

    public void setEnableHealthCheck(Boolean enableHealthCheck) {
        this.enableHealthCheck = enableHealthCheck;
    }
}