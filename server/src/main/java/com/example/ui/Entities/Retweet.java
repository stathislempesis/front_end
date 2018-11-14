package com.example.ui.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "retweets")
public class Retweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "retweet")
    private Long retweet;

    @Column(name = "retweetedTweet")
    private Long retweetedTweet;

}
