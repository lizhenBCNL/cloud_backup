package com.arkcloud.pojo;

public class Source {
    private Integer id;

    private String srcAddr;

    private Integer srcPort;

    private String srcUser;

    private String srcPsd;

    private String srcDescription;

    private Integer srcOwner;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSrcAddr() {
        return srcAddr;
    }

    public void setSrcAddr(String srcAddr) {
        this.srcAddr = srcAddr == null ? null : srcAddr.trim();
    }

    public Integer getSrcPort() {
        return srcPort;
    }

    public void setSrcPort(Integer srcPort) {
        this.srcPort = srcPort;
    }

    public String getSrcUser() {
        return srcUser;
    }

    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser == null ? null : srcUser.trim();
    }

    public String getSrcPsd() {
        return srcPsd;
    }

    public void setSrcPsd(String srcPsd) {
        this.srcPsd = srcPsd == null ? null : srcPsd.trim();
    }

    public String getSrcDescription() {
        return srcDescription;
    }

    public void setSrcDescription(String srcDescription) {
        this.srcDescription = srcDescription == null ? null : srcDescription.trim();
    }

    public Integer getSrcOwner() {
        return srcOwner;
    }

    public void setSrcOwner(Integer srcOwner) {
        this.srcOwner = srcOwner;
    }
}