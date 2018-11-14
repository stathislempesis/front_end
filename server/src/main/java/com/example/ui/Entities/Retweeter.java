package com.example.ui.Entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "retweeters")
public class Retweeter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;

    @Column(name = "retweeted_user_id")
    private Long retweeted_user_id;

    @Column(name = "retweeter_id")
    private Long retweeter_id;

    @Column(name = "timestamp")
    private Date timestamp;
}
