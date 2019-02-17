package com.example.ui.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "replies")
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "replied_tweet_id")
    private Long replied_tweet_id;

    @Column(name = "reply_id")
    private Long reply_id;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "user_id_of_replied_tweet")
    private Long user_id_of_replied_tweet;
}
