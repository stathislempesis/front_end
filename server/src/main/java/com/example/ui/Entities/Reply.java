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

    @Column(name = "repliedTweetId")
    private Long repliedTweetId;

    @Column(name = "replyId")
    private Long replyId;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "userIdOfRepliedTweet")
    private Long userIdOfRepliedTweet;
}
