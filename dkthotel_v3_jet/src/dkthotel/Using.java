/*
 * V1- MAT
 * 
 */
package dkthotel;

/**
 *
 * @author mat
 */
public class Using {
    private String note;
    private String serviceId;
    private String bookingId;

    public Using(String note, String serviceId, String bookingId) {
        this.note = note;
        this.serviceId = serviceId;
        this.bookingId = bookingId;
    }
    public Using(){
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public String toString() {
        return "Using{" + "note=" + note + ", serviceId=" + serviceId + ", bookingId=" + bookingId + '}';
    }
    
    
}
