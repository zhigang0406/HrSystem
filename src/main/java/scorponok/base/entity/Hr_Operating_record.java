package scorponok.base.entity;

import java.util.Date;

public class Hr_Operating_record {
    private Long operatingRecordId;

    private String operatingRecorName;

    private String operatingRecordDepartment;

    private String operatingRecordBdepartment;

    private String operatingRecordBname;

    private String operatingRecordThing;

    private Date operatingRecordTime;

    public Long getOperatingRecordId() {
        return operatingRecordId;
    }

    public void setOperatingRecordId(Long operatingRecordId) {
        this.operatingRecordId = operatingRecordId;
    }

    public String getOperatingRecorName() {
        return operatingRecorName;
    }

    public void setOperatingRecorName(String operatingRecorName) {
        this.operatingRecorName = operatingRecorName == null ? null : operatingRecorName.trim();
    }

    public String getOperatingRecordDepartment() {
        return operatingRecordDepartment;
    }

    public void setOperatingRecordDepartment(String operatingRecordDepartment) {
        this.operatingRecordDepartment = operatingRecordDepartment == null ? null : operatingRecordDepartment.trim();
    }

    public String getOperatingRecordBdepartment() {
        return operatingRecordBdepartment;
    }

    public void setOperatingRecordBdepartment(String operatingRecordBdepartment) {
        this.operatingRecordBdepartment = operatingRecordBdepartment == null ? null : operatingRecordBdepartment.trim();
    }

    public String getOperatingRecordBname() {
        return operatingRecordBname;
    }

    public void setOperatingRecordBname(String operatingRecordBname) {
        this.operatingRecordBname = operatingRecordBname == null ? null : operatingRecordBname.trim();
    }

    public String getOperatingRecordThing() {
        return operatingRecordThing;
    }

    public void setOperatingRecordThing(String operatingRecordThing) {
        this.operatingRecordThing = operatingRecordThing == null ? null : operatingRecordThing.trim();
    }

    public Date getOperatingRecordTime() {
        return operatingRecordTime;
    }

    public void setOperatingRecordTime(Date operatingRecordTime) {
        this.operatingRecordTime = operatingRecordTime;
    }
}