/*
 * 
 * Ver 1- MAT
 */
package dkthotel;

import java.sql.Date;

/**
 *
 * @author mat
 */
public class Invoice {
    private String invoiceId;
    private Date invoiceDate;
    private float invoicePrice;
    private String bookingId;
    private String staffId;

    public Invoice(String invoiceId, Date invoiceDate, float invoicePrice, String bookingId, String staffId) {
        this.invoiceId = invoiceId;
        this.invoiceDate = invoiceDate;
        this.invoicePrice = invoicePrice;
        this.bookingId = bookingId;
        this.staffId = staffId;
    }
    
    public Invoice(){
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public float getInvoicePrice() {
        return invoicePrice;
    }

    public void setInvoicePrice(float invoicePrice) {
        this.invoicePrice = invoicePrice;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Invoice{" + "invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoicePrice=" + invoicePrice + ", bookingId=" + bookingId + ", staffId=" + staffId + '}';
    }
    
}
