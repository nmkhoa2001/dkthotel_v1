/*
 * V1 - MAT
 * 
 */
package dkthotel;

/**
 *
 * @author mat
 */
public class Room {
    private String roomId;
    private String roomType;
    private String roomName;
    private float roomPrice;
    private String roomStatus;
    private String bookingId;

    public Room(String roomId, String roomType, String roomName, float roomPrice, String roomStatus, String bookingId) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.roomName = roomName;
        this.roomPrice = roomPrice;
        this.roomStatus = roomStatus;
        this.bookingId = bookingId;
    }
    public Room(){
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public float getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(float roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", roomType=" + roomType + ", roomName=" + roomName + ", roomPrice=" + roomPrice + ", roomStatus=" + roomStatus + ", bookingId=" + bookingId + '}';
    }
    
    
}
