/*
 * Ver 1- MAT
 * 
 */
package dkthotel;

import java.sql.Date;

/**
 *
 * @author mat
 */
public class Customer {
    private String customerId;
    private String customerName;
    private String identifyCard;
    private String nationality;
    private String customerGender;
    private Date customerDob;
    private String customerPhone;
    private String bookingId;

    public Customer(String customerId, String customerName, String identifyCard, String nationality, String customerGender, Date customerDob, String customerPhone, String bookingId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.identifyCard = identifyCard;
        this.nationality = nationality;
        this.customerGender = customerGender;
        this.customerDob = customerDob;
        this.customerPhone = customerPhone;
        this.bookingId = bookingId;
    }
    
    public Customer(){}

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public Date getCustomerDob() {
        return customerDob;
    }

    public void setCustomerDob(Date customerDob) {
        this.customerDob = customerDob;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", identifyCard=" + identifyCard + ", nationality=" + nationality + ", customerGender=" + customerGender + ", customerDob=" + customerDob + ", customerPhone=" + customerPhone + ", bookingId=" + bookingId + '}';
    }
    
}
