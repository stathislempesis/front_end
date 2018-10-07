package com.example.ui.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tweets1")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

   // @ManyToOne
    @Column(name = "userID")
    private Long userID;

    @Column(name = "statusID")
    private Long statusID;

    @Column(name = "date")
    private Date date;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getStatusID() {
        return statusID;
    }

    public void setStatusID(Long statusID) {
        this.statusID = statusID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "userID=" + userID +
                ", statusID=" + statusID +
                ", date=" + date +
                '}';
    }
}
