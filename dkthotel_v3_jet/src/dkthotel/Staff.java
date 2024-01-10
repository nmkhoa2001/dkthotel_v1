/*
 *  ver 1 - MAT
 * 
 */
package dkthotel;

import java.sql.Date;

/**
 *
 * @author mat
 */
public class Staff {
    private String staffId;
    private String staffName;
    private String staffGender;
    private Date staffDob;
    private String title;
    private float staffSalary;
    private String staffNote;

    public Staff(String staffId, String staffName, String staffGender, Date staffDob, String title, float staffSalary, String staffNote) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffGender = staffGender;
        this.staffDob = staffDob;
        this.title = title;
        this.staffSalary = staffSalary;
        this.staffNote = staffNote;
    }
    
    public Staff(){
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    public Date getStaffDob() {
        return staffDob;
    }

    public void setStaffDob(Date staffDob) {
        this.staffDob = staffDob;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(float staffSalary) {
        this.staffSalary = staffSalary;
    }

    public String getStaffNote() {
        return staffNote;
    }

    public void setStaffNote(String staffNote) {
        this.staffNote = staffNote;
    }

    @Override
    public String toString() {
        return "Staff{" + "staffId=" + staffId + ", staffName=" + staffName + ", staffGender=" + staffGender + ", staffDob=" + staffDob + ", title=" + title + ", staffSalary=" + staffSalary + ", staffNote=" + staffNote + '}';
    }
    
    
}
