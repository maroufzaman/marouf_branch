package com.rmrfroot.tasktracker222.Drills;

import com.rmrfroot.tasktracker222.entities.Day;

import javax.persistence.*;

@Entity
@Table(name="drills")
public class Drill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="drill_name")
    private String drillName;

    @Column(name="drill_day")
    private Day drillDay;

    public void setId(int drill_id){this.id = drill_id;}


    public int getId() {
        return id;
    }

    public String getDrillName() {
        return drillName;
    }

    public Day getDay(){return drillDay;}
}
