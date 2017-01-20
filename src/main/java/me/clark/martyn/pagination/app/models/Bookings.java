package me.clark.martyn.pagination.app.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;
import java.util.Objects;

/**
 * User: martyn
 * Date: 23/04/2016
 * Time: 12:31
 */
@Entity
@XmlRootElement
public class Bookings {

    private Long id;

    private Date dateCreated;

    private Long duration;

    private Date end;

    private boolean processed;

    private String slot;

    private Date start;

    private String status;

    private Long userId;

    private String userType;

    private Long vehicleId;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date_created")
    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Basic
    @Column(name = "duration")
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Basic
    @Column(name = "end")
    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    @Basic
    @Column(name = "processed")
    public boolean getProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }

    @Basic
    @Column(name = "slot")
    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    @Basic
    @Column(name = "start")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "user_id")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_type")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "vehicle_id")
    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bookings bookings = (Bookings) o;
        return Objects.equals(id, bookings.id) &&
                Objects.equals(dateCreated, bookings.dateCreated) &&
                Objects.equals(duration, bookings.duration) &&
                Objects.equals(end, bookings.end) &&
                Objects.equals(processed, bookings.processed) &&
                Objects.equals(slot, bookings.slot) &&
                Objects.equals(start, bookings.start) &&
                Objects.equals(status, bookings.status) &&
                Objects.equals(userId, bookings.userId) &&
                Objects.equals(userType, bookings.userType) &&
                Objects.equals(vehicleId, bookings.vehicleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreated, duration, end, processed, slot, start, status, userId, userType, vehicleId);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bookings{");
        sb.append("id=").append(id);
        sb.append(", dateCreated=").append(dateCreated);
        sb.append(", duration=").append(duration);
        sb.append(", end=").append(end);
        sb.append(", processed=").append(processed);
        sb.append(", slot='").append(slot).append('\'');
        sb.append(", start=").append(start);
        sb.append(", status='").append(status).append('\'');
        sb.append(", userId=").append(userId);
        sb.append(", userType='").append(userType).append('\'');
        sb.append(", vehicleId=").append(vehicleId);
        sb.append('}');
        return sb.toString();
    }
}
