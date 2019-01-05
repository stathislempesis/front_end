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

    @Column(name = "app_user_flag")
    private Boolean appUserFlag;

    public Long getRetweeted_user_id() {
        return retweeted_user_id;
    }

    public Long getRetweeter_id() {
        return retweeter_id;
    }

    @Override
    public String toString() {
        return "Retweeter{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", retweeted_user_id=" + retweeted_user_id +
                ", retweeter_id=" + retweeter_id +
                ", timestamp=" + timestamp +
                ", appUserFlag=" + appUserFlag +
                '}';
    }
}
