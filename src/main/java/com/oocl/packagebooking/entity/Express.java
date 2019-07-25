package com.oocl.packagebooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table
@Entity
public class Express {

    @Id
    private String id;

    private String recipient;

    private String phone;

    private String status;

    private Date bookinkTime;

    public Express() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBookinkTime() {
        return bookinkTime;
    }

    public void setBookinkTime(Date bookinkTime) {
        this.bookinkTime = bookinkTime;
    }
}
