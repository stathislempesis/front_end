package com.example.ui.Entities;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;
import java.util.ArrayList;


@Entity
@Table(name = "trends_lists")
public class TrendsList
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "trend_id_1", unique = true)
    private Long trend_id_1;

    @Column(name = "trend_id_2", unique = true)
    private Long trend_id_2;

    @Column(name = "trend_id_3", unique = true)
    private Long trend_id_3;

    @Column(name = "trend_id_4", unique = true)
    private Long trend_id_4;

    @Column(name = "trend_id_5", unique = true)
    private Long trend_id_5;

    @Column(name = "trend_id_6", unique = true)
    private Long trend_id_6;

    @Column(name = "trend_id_7", unique = true)
    private Long trend_id_7;

    @Column(name = "trend_id_8", unique = true)
    private Long trend_id_8;

    @Column(name = "trend_id_9", unique = true)
    private Long trend_id_9;

    @Column(name = "trend_id_10", unique = true)
    private Long trend_id_10;


    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Timestamp getTimestamp()
    {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp)
    {
        this.timestamp = timestamp;
    }

    public Long getTrendId1()
    {
        return trend_id_1;
    }

    public void setTrendId1(Long trend_id_1)
    {
        this.trend_id_1 = trend_id_1;
    }

    public Long getTrendId2()
    {
        return trend_id_2;
    }

    public void setTrendId2(Long trend_id_2)
    {
        this.trend_id_2 = trend_id_2;
    }

    public Long getTrendId3()
    {
        return trend_id_3;
    }

    public void setTrendId3(Long trend_id_3)
    {
        this.trend_id_3 = trend_id_3;
    }

    public Long getTrendId4()
    {
        return trend_id_4;
    }

    public void setTrendId4(Long trend_id_4)
    {
        this.trend_id_4 = trend_id_4;
    }

    public Long getTrendId5()
    {
        return trend_id_5;
    }

    public void setTrendId5(Long trend_id_5)
    {
        this.trend_id_5 = trend_id_5;
    }

    public Long getTrendId6()
    {
        return trend_id_6;
    }

    public void setTrendId6(Long trend_id_6)
    {
        this.trend_id_6 = trend_id_6;
    }

    public Long getTrendId7()
    {
        return trend_id_7;
    }

    public void setTrendId7(Long trend_id_7)
    {
        this.trend_id_7 = trend_id_7;
    }

    public Long getTrendId8()
    {
        return trend_id_8;
    }

    public void setTrendId8(Long trend_id_8)
    {
        this.trend_id_8 = trend_id_8;
    }

    public Long getTrendId9()
    {
        return trend_id_9;
    }

    public void setTrendId9(Long trend_id_19)
    {
        this.trend_id_9 = trend_id_9;
    }

    public Long getTrendId10()
    {
        return trend_id_10;
    }

    public void setTrendId10(Long trend_id_10)
    {
        this.trend_id_10 = trend_id_10;
    }


    @Override
    public String toString()
    {
        return "Trend{" +
                "id=" + this.id +
                ", timestamp=" + this.timestamp +
                ", trend_id_1=" + this.trend_id_1 +
                ", trend_id_2=" + this.trend_id_2 +
                ", trend_id_3=" + this.trend_id_3 +
                ", trend_id_4=" + this.trend_id_4 +
                ", trend_id_5=" + this.trend_id_5 +
                ", trend_id_6=" + this.trend_id_6 +
                ", trend_id_7=" + this.trend_id_7 +
                ", trend_id_8=" + this.trend_id_8 +
                ", trend_id_9=" + this.trend_id_9 +
                ", trend_id_10=" + this.trend_id_10 +
                '}';
    }


    public List<Long> trendsIds()
    {
        List<Long> trendsIds = new ArrayList<>();

        trendsIds.add( this.getTrendId1() );
        trendsIds.add( this.getTrendId2() );
        trendsIds.add( this.getTrendId3() );
        trendsIds.add( this.getTrendId4() );
        trendsIds.add( this.getTrendId5() );
        trendsIds.add( this.getTrendId6() );
        trendsIds.add( this.getTrendId7() );
        trendsIds.add( this.getTrendId8() );
        trendsIds.add( this.getTrendId9() );
        trendsIds.add( this.getTrendId10() );

        return trendsIds;
    }
}
