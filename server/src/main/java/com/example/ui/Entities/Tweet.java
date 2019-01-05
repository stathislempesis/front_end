package com.example.ui.Entities;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;



// It needs user ID

@Entity
@Table(name = "tweets")
public class Tweet
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "twitter_id", unique = true)
    private Long twitter_id;

    @Column(name = "text", length = 1024)
    private String text;

    @Column(name = "clean_text", length = 1024)
    private String clean_text;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "userID", unique = true)
    private Long userID;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getTwitterId()
    {
        return this.twitter_id;
    }

    public void setTwitterId(Long twitter_id)
    {
        this.twitter_id = twitter_id;
    }

    public String getText()
    {
        return this.text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getCleanText()
    {
        return this.clean_text;
    }

    public void setCleanText(String clean_text)
    {
        this.clean_text = clean_text;
    }

    public Timestamp getTimestamp()
    {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public Date getCreated_at()
    {
        return this.created_at;
    }

    public void setCreated_at(Date created_at)
    {
        this.created_at = created_at;
    }

    public Date getUpdated_at()
    {
        return this.updated_at;
    }

    public void setUpdated_at(Date updated_at)
    {
        this.updated_at = updated_at;
    }

    public Long getUserId()
    {
        return this.userID;
    }

    public void setUserId(Long userID)
    {
        this.userID = userID;
    }


    @Override
    public String toString()
    {
        return "Tweet{" +
                "id=" + this.id +
                ", twitter_id=" + this.twitter_id +
                ", text=" + this.text +
                ", clean_text=" + this.clean_text +
                ", timestamp=" + this.timestamp +
                ", created_at=" + this.created_at +
                ", updated_at=" + this.updated_at +
                ", userID=" + this.userID +
                '}';
    }

}
