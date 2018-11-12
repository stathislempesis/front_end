package com.example.ui.Entities;

import javax.persistence.*;
import java.util.Date;

// It needs user ID

@Entity
@Table(name = "tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "clean_text", length = 1024)
    private String clean_text;

    @Column(name = "text", length = 1024)
    private String text;

    @Column(name = "timestamp")
    private Date timestamp;

    @Column(name = "twitter_id")
    private Long twitter_id;

}
