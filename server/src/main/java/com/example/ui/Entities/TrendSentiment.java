package com.example.ui.Entities;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "trend_sentiments")
public class TrendSentiment
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "trend_id")
    private Long trend_id;

    @Column(name = "anger")
    private Double anger;

    @Column(name = "disgust")
    private Double disgust;

    @Column(name = "fear")
    private Double fear;

    @Column(name = "happiness")
    private Double happiness;

    @Column(name = "sadness")
    private Double sadness;

    @Column(name = "surprise")
    private Double surprise;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getTrend_id()
    {
        return this.trend_id;
    }

    public void setTrend_id(Long trend_id)
    {
        this.trend_id = trend_id;
    }

    public Double getAnger()
    {
        return this.anger;
    }

    public void setAnger(Double anger)
    {
        this.anger = anger;
    }

    public Double getDisgust()
    {
        return this.disgust;
    }

    public void setDisgust(Double disgust)
    {
        this.disgust = disgust;
    }

    public Double getFear()
    {
        return this.fear;
    }

    public void setFear(Double fear)
    {
        this.fear = fear;
    }

    public Double getHappiness()
    {
        return this.happiness;
    }

    public void setHappiness(Double happiness)
    {
        this.happiness = happiness;
    }

    public Double getSadness()
    {
        return this.sadness;
    }

    public void setSadness(Double sadness)
    {
        this.sadness = sadness;
    }

    public Double getSurprise()
    {
        return this.surprise;
    }

    public void setSurprise(Double surprise)
    {
        this.surprise = surprise;
    }

    public Date getCreated_at()
    {
        return this.created_at;
    }

    public Date getUpdated_at()
    {
        return this.updated_at;
    }

    public void setCreated_at(Date created_at)
    {
        this.created_at = created_at;
    }

    public void setUpdated_at(Date updated_at)
    {
        this.updated_at = updated_at;
    }


    @Override
    public String toString()
    {
        return "Trend{" +
                "id=" + this.id +
                ", trend_id=" + this.trend_id +
                ", anger=" + this.anger +
                ", disgust=" + this.disgust +
                ", fear=" + this.fear +
                ", happiness=" + this.happiness +
                ", sadness=" + this.sadness +
                ", surprise=" + this.surprise +
                ", created_at=" + this.created_at +
                ", updated_at=" + this.updated_at +
                '}';
    }
}
