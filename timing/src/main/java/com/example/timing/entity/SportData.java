package com.example.timing.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class SportData implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer steps;
    private String evaluate;
    private Date date;

    public SportData(Integer steps, String evaluate, Date date) {
        this.steps = steps;
        this.evaluate = evaluate;
        this.date = date;
    }
}
