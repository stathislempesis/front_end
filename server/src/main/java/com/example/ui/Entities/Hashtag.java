package com.example.ui.Entities;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hashtags")
public class Hashtag
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true, length = 50)
    private String name;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "updated_at")
    private Date updated_at;


    public Long getId()
    {
        return this.id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
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


    @Override
    public String toString()
    {
        return "Hashtag{" +
                "id=" + this.id +
                ", name=" + this.name +
                ", created_at=" + this.created_at +
                ", updated_at=" + this.updated_at +
                '}';
    }
}
