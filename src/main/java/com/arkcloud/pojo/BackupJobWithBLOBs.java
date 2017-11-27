package com.arkcloud.pojo;

public class BackupJobWithBLOBs extends BackupJob {
    private String snmpNotification;

    private String emails;

    public String getSnmpNotification() {
        return snmpNotification;
    }

    public void setSnmpNotification(String snmpNotification) {
        this.snmpNotification = snmpNotification == null ? null : snmpNotification.trim();
    }

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails == null ? null : emails.trim();
    }

	@Override
	public String toString() {
		return "BackupJobWithBLOBs [snmpNotification=" + snmpNotification + ", emails=" + emails + "]";
	}
    
}